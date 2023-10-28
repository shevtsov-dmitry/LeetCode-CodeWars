package code_wars.java.dynamic;

import java.util.Arrays;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int res = sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println("res = " + res);
    }
    public static int sequence(int[] arr) {
        if (arr.length == 0) return 0;
        int countPositives = 0;
        int countNegatives = 0;
        int sum = 0;
        int maximalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // conditions handling - if all elements are negative or positive
            if(arr[i] >= 0){
                countPositives++;
            } else if (arr[i] < 0) {
                countNegatives++;
            }
            if(countPositives == arr.length) return Arrays.stream(arr).sum();
            if(countNegatives == arr.length) return 0;
            // find maximum sum

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maximalSum = Math.max(maximalSum, sum);
            }
            sum = 0;
        }

        return maximalSum;
    }
}
