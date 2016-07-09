package algorithm.BestTimeToBuyAndSellStockWithCooldown.java;

public class BestTimeToBuyAndSellStockWithCooldown {
	// DP Algorithm
	// buy[i] = max(buy[i-1], sell[i-2]-price)
	// sell[i] = max(sell[i-1], buy[i-1]+price)
	public int maxProfit(int[] prices) {
		int sell = 0;
		int prev_sell = 0;
		// make first buy determine doesn't have problem
		int buy = Integer.MIN_VALUE;
		int prev_buy = 0;
        for(int price:prices){
        	prev_buy = buy;
        	buy = Math.max(prev_buy, prev_sell - price);
        	prev_sell = sell;
        	sell = Math.max(prev_sell, prev_buy + price);
        }
        return sell;
    }
}
