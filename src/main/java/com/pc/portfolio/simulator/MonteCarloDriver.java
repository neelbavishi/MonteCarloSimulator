package com.pc.portfolio.simulator;

import java.text.NumberFormat;
import java.util.Locale;

import com.pc.portfolio.entity.Portfolio;
import com.pc.portfolio.entity.PortfolioSimulationStats;

public class MonteCarloDriver {
    public static void main (String arga[]) {
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        MonteCarloSimulator portfolioSimulator = new MonteCarloSimulator();

        Portfolio p1 = new Portfolio("Aggresive", 0.094324, 0.15675);
        PortfolioSimulationStats aggresivePortfolioStatistics = portfolioSimulator.simulate(p1, 10000, 20, 100000,
                0.035);
        
        System.out.println("------------------ Aggresive Investment Strategy --------------------\n");

        System.out.println(aggresivePortfolioStatistics.getType()  + ": Best Case = "
                + currencyFormatter.format(aggresivePortfolioStatistics.getBestCase()));
        System.out.println(aggresivePortfolioStatistics.getType()  + ": Worst Case = "
                + currencyFormatter.format(aggresivePortfolioStatistics.getWorstCase()));
        System.out.println(aggresivePortfolioStatistics.getType()  + ": Median Case = " 
                + currencyFormatter.format(aggresivePortfolioStatistics.getMedian()) + "\n");

        Portfolio p2 = new Portfolio("Very Conservative", 0.06189, 0.063438);
        PortfolioSimulationStats very_conservativePortfolioStatistics = portfolioSimulator.simulate(p2,
                10000, 20, 100000, 0.035);

        
        System.out.println("--------------- Very Conservative Investment Strategy ---------------\n" );

        System.out.println(very_conservativePortfolioStatistics.getType()  + ": Best Case = "
                + currencyFormatter.format(very_conservativePortfolioStatistics.getBestCase()));
        System.out.println(very_conservativePortfolioStatistics.getType()  + ": Worst Case = "
                + currencyFormatter.format(very_conservativePortfolioStatistics.getWorstCase()));
        System.out.println(very_conservativePortfolioStatistics.getType()  + ": Median Case = " 
                + currencyFormatter.format(very_conservativePortfolioStatistics.getMedian()) + "\n");
    }
}