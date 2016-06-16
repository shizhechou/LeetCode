package algorithm.BestTimeToBuyAndSellStockII.java;

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		int profit = 0;
		// [5,8,9,10] = 10-5 = 5 = (8-5) + (9-8) + (10-9)
		// Divide transactions to slice, don't find max and min value ...
		for (int i = 1; i < prices.length; i++) {
			profit += (prices[i] - prices[i - 1] > 0) ? prices[i] - prices[i - 1] : 0;
		}
		return profit;
	}
}
