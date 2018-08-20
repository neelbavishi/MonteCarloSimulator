package com.pc.portfolio.entity;

public class Portfolio {
    private String type;
    private double meanReturn;
    private double stdDev;
    
    public Portfolio(String type, double meanReturn, double stdDev) {
        this.type = type;
        this.meanReturn = meanReturn;
        this.stdDev = stdDev;
    }
    
    public String getType() {
        return type;
    }
    public double getMeanReturn() {
        return meanReturn;
    }
    public double getStdDev() {
        return stdDev;
    }
    
    @Override
    public String toString() {
        return "Portfolio [type=" + type + ", meanReturn=" + meanReturn + ", stdDiv="
                + stdDev + "]";
    }
}
