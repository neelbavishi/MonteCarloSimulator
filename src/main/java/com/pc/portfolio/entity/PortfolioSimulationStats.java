package com.pc.portfolio.entity;

public class PortfolioSimulationStats {
    private double bestCase, worstCase, median;
    private String type;

    public PortfolioSimulationStats(String type, double bestCase, double worstCase, double median) {
        this.type = type;
        this.bestCase = bestCase;
        this.worstCase = worstCase;
        this.median = median;
    }
    
    public String getType() {
        return type;
    }

    public double getBestCase() {
        return bestCase;
    }

    public double getWorstCase() {
        return worstCase;
    }

    public double getMedian() {
        return median;
    }
    
    @Override
    public String toString() {
        return "PortfolioSimulationStats [type=" + type + ", bestCase=" + bestCase + ", median="
                + median + ", worstCase="
                        + worstCase + "]";
    }
}
