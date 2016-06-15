package algorithm.BestTimeToBuyAndSellStock.java;

public class BestTimeToBuyAndSellStock {

	public int maxProfit(int[] prices) {
		int profit = 0;
		if (prices.length == 0) {
			return profit;
		}
		int bought = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > bought) {
				profit = profit < (prices[i] - bought) ? prices[i] - bought : profit;
//				if (profit < (prices[i] - bought)) {
//					profit = prices[i] - bought;
//				}
			} else {
				bought = prices[i];
			}
		}
		return profit;
	}
}
