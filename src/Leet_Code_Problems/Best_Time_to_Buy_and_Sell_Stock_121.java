package Leet_Code_Problems;

import java.util.Arrays;

public final class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		// 4,1,5,2,7
		maxProfit(new int[] {7,1,5,3,6,4});
	}
	
	public static int maxProfit(int[] prices) {
		int cheapestPrice = prices[0];
		int cheapestPriceIndex = 0;
		for (int i = 1; i < prices.length; i++) {
			cheapestPrice = Integer.min(cheapestPrice, i);
			if(cheapestPrice < prices[i]) {
				cheapestPriceIndex = i;
			}
		}
		System.out.println("lovely%d".formatted(124894));
//		for (int i = cheapestPriceIndex; i < prices.length; i++) {
//			if()
//		}
		
		return 0;
    }

}
