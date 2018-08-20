package com.pc.portfolio.simulator;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import com.pc.portfolio.entity.Portfolio;
import com.pc.portfolio.entity.PortfolioSimulationStats;

import java.util.Random;

public class MonteCarloSimulator {
    private Random r = new Random();

    /**
     * This method generates random value using Gaussian distribution
     *
     * @param meanVal
     * @param stdDevVal
     * @return rand
     */
    public double generateGaussianRandom(double meanVal, double stdDevVal) {
        double nextGauss = r.nextGaussian();
        double rand = nextGauss * stdDevVal + meanVal;
        return rand;
    }

    /**
     * This method runs a MonteCarlo simulation to generate Portfolio statistics.
     *
     * @param simulationCount
     * @param yearCount
     * @param mean
     * @param stdDev
     * @param initialInvestment
     * @param inflation
     * @return simulationStats
     */
    public PortfolioSimulationStats simulate(Portfolio portfolio, int simulationCount, int yearCount,
            double initialInvestment, double inflation) {
        double[] investmentSimulationArray = new double[simulationCount];
        for (int i = 0; i < simulationCount; i++) {
            double investment = initialInvestment;
            for (int j = 0; j < yearCount; j++) {
                // end of year value
                investment = investment
                        * (1 + generateGaussianRandom(portfolio.getMeanReturn(), portfolio.getStdDev()));
                // adjustment for inflation
                investment = investment * (1 - inflation);
            }
            investmentSimulationArray[i] = investment;
        }
        DescriptiveStatistics ds = new DescriptiveStatistics(investmentSimulationArray);
        String type = portfolio.getType();
        double bestCase = ds.getPercentile(90);
        double worstCase = ds.getPercentile(10);
        double median = ds.getPercentile(50);

        PortfolioSimulationStats simulationStats = new PortfolioSimulationStats(type, bestCase, worstCase, median);
        return simulationStats;
    }

}
