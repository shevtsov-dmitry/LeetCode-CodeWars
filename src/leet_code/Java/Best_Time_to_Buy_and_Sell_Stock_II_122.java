package leet_code.Java;

public class Best_Time_to_Buy_and_Sell_Stock_II_122 {

	public static void main(String[] args) {
		// 1,2,3,4,5  -> buy 1 sell 5
		maxProfit(new int[] {1,2,3,4,5}); // -> buy 1 sell 5, buy 3 sell 6
		
	}
	public static int maxProfit(int[] prices) {
		int overallProfit = 0;
		int buy = Integer.MAX_VALUE;
		int sell = 0;
		
		for (int i = 0; i < prices.length - 1; i++) {
			int currentElem = prices[i];
			int nextElem = prices[i+1];
			if(currentElem < nextElem ) {
				buy = Math.min(currentElem, buy);
			}
			else {
				sell = Math.max(sell, currentElem - buy);
				overallProfit += sell;
				
				// reset to default values
				sell = 0;
				buy = Integer.MAX_VALUE;
			}
			if(i == prices.length - 2 && currentElem < nextElem){
				overallProfit += nextElem - buy;
			}
		}
		return overallProfit;
	}
	
	
}
