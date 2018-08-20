# MonteCarloSimulator

Modern Portfolio Theory says that it is not enough to look at the expected risk and return of one particular stock. By investing in more than one stock, an investor can reap the benefits of diversification- chief among them, a reduction in the riskiness of the portfolio.

A Real Time implementation of Modern Portfolio Theory is to build an optimal asset allocation of domestic stocks & bonds, international stock and bonds, alternatives and cash. Combining the risk & return of each asset class and correlations across them – we come up with the risk and return of the overall portfolio.

Two portfolios were created, one being extremely Conservative
and one being Aggressive.

| Portfolio Type        |  Mean Return  |  Std. Deviation  |
| --------------------- |  -----------  |  --------------  |
| A - Aggressive        |    9.4324%    |     15.675%      |
| I - Very Conservative |    6.189%     |     6.3438%      |


This MonteCarlo simulator uses a random number generator to ensure Gaussian distribution of random
numbers that are generated.

## Driver Program ## 
com/pc/portfolio/simulator/MonteCarloDriver.java

## Main Simulation Program ##
com/pc/portfolio/simulator/MonteCarloSimulator.java

## Assumptions for MonteCarlo Simulation Algorithm ## 

1. Portfolio Inflation Adjusted Values from Simulation
2. Number of simulations = 10,000
3. Each simulation projected over 20 years
4. Initial investment = $100,000
5. Inflation adjusted at the rate of 3.5% each year

## Simulation Results ##

| Portfolio Type        | Median 20th Year | 10% Best Case | 10% Worst Case |
| --------------------- | ---------------- | ------------- | -------------- |
| A - Aggressive        | $245,543.85      | $550,741.88   | $102,243.24    |
| I - Very Conservative | $157,583.58      | $222,455.11   | $110,421.34    |

