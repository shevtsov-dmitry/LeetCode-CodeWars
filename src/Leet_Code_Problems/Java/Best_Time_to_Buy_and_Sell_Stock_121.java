package Leet_Code_Problems.Java;

import java.util.Arrays;

public final class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		// 4,1,5,2,7
		maxProfit(new int[] {7,1,5,3,6,4});
	}
	
	public static int maxProfit(int[] prices) {
		int buy = Integer.MAX_VALUE;
		int sell = 0;
		for (int i = 0; i < prices.length; i++) {
			int currentPrice = prices[i];
			buy = Math.min(buy, currentPrice);
			sell = Math.max(sell, currentPrice - buy);
		}
		return sell;
	}
}
