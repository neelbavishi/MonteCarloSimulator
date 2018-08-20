package com.pc.portfolio.simulator;

import org.junit.Test;

import com.pc.portfolio.entity.Portfolio;
import com.pc.portfolio.entity.PortfolioSimulationStats;
import com.pc.portfolio.simulator.MonteCarloSimulator;

import static org.junit.Assert.assertTrue;

public class PortfolioSimulatorTest {
    MonteCarloSimulator simulator = new MonteCarloSimulator();
    
    @Test
    public void testGenerateGaussianRandom() {
        assertTrue(simulator.generateGaussianRandom(0,1) >= -1);
        assertTrue(simulator.generateGaussianRandom(0,1) <= 1);
        assertTrue(simulator.generateGaussianRandom(0,1) <= 40);
    }
    
    @Test
    public void testSimulation() {
        Portfolio portfolio = new Portfolio("Aggresive", 0.094324, 0.15675);
        PortfolioSimulationStats portfolioStats = simulator.simulate(portfolio, 100, 20, 10000, 0.035);
        
        double medianCase = portfolioStats.getMedian();
        double bestCase = portfolioStats.getBestCase();
        double worstCase = portfolioStats.getWorstCase();
        
        assertTrue(bestCase > medianCase);
        assertTrue(medianCase > worstCase);
    }
}