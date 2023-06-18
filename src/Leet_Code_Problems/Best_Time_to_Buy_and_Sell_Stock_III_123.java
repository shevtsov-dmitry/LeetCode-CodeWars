package Leet_Code_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Best_Time_to_Buy_and_Sell_Stock_III_123 {

	public static void main(String[] args) {
		// 1,2,3,4,5
		// 3,3,5,0,0,3,1,4
//		System.out.println(maxProfit(new int[] { 1, 4, 2 }));
//		System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(maxProfit(new int[] { 3, 3, 5, 0, 0, 3, 1, 4 }));
	}

	public static int maxProfitF(int[] prices) {
		int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
		int release1 = 0, release2 = 0;
		for (int i : prices) { // Assume we only have 0 money at first
			release2 = Math.max(release2, hold2 + i); // The maximum if we've just sold 2nd stock so far.
			hold2 = Math.max(hold2, release1 - i); // The maximum if we've just buy 2nd stock so far.
			release1 = Math.max(release1, hold1 + i); // The maximum if we've just sold 1nd stock so far.
			hold1 = Math.max(hold1, -i); // The maximum if we've just buy 1st stock so far.
			System.out.printf("""
				number: %d
				release2: %d release1: %d hold2: %d hold1: %d
				""", i,release2,hold2, release1,hold1);
		}

		
		return release2; /// Since release1 is initiated as 0, so release2 will always higher than
	}
	
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) return 0;
	    int maxProfit = 0;
		int lenght = prices.length;
		
		int[] leftProfit = new int[lenght];
		int leftMaxProfit = 0;
		int leftMin = prices[0];
	    for (int i=0; i<lenght; i++) {
	    	if (prices[i] < leftMin) leftMin = prices[i];
	    	int profit = prices[i] - leftMin;
	    	if (profit > leftMaxProfit) leftMaxProfit = profit;
	    	leftProfit[i] = leftMaxProfit;
	    }
	    System.out.println(Arrays.toString(leftProfit));
	    
	    int rightMaxProfit = 0;
		int rightMax = prices[lenght-1];
		for (int i=lenght-1; i>=0; i--) {
	    	if (prices[i] > rightMax) rightMax = prices[i];
	    	if (rightMax - prices[i] > rightMaxProfit) rightMaxProfit = rightMax - prices[i];
	    	int currentProfit = rightMaxProfit + (i>0 ? leftProfit[i-1] : 0);
	    	if (currentProfit > maxProfit) {
	    		maxProfit = currentProfit;
	    	}
	    }
		
	    return maxProfit;
	}
	
}
