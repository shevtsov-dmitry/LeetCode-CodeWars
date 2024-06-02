/**
 * MaximumAverageSubarrayI643
 */
public class MaximumAverageSubarrayI643 {

	public static void main(String[] args) {
		// Input: nums = [1,12,-5,-6,50,3], k = 4
		// Output: 12.75000
		// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
		int[] array = new int[] { 1, 12, -5, -6, 50, 3 };
		double maxAverage = findMaxAverage(array, 4);
		assert maxAverage == 12.75 : String.format("%f exprexted 12,75", maxAverage);
	}

	public static double findMaxAverage(int[] nums, int k) {
		if (nums.length == 1) {
			return nums[0];
		}
		double maxSum = 0D;
		for (int i = 0, r = i + k; r < nums.length; i++, r++) {
			double subArrSum = 0;
			for (k = i; k < r; k++) {
				subArrSum += nums[k];
			}
			maxSum = Math.max(maxSum, subArrSum / 4);
		}
		return maxSum;
	}
}
