package leet_code.java;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Create prefix and postfix arrays to store products
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        // Initialize prefix array
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Initialize postfix array
        postfix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }

        // Calculate the final result array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * postfix[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        // Print the result
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
//    public static void main(String[] args) {
////      Input: nums = [1,2,3,4]
////      Output: [24,12,8,6]
//        int[] productExceptSelf = productExceptSelf(new int[]{1, 2, 3, 4});
//        System.out.println("productExceptSelf = " + Arrays.toString(productExceptSelf));
//    }
//
//    public static int[] productExceptSelf(int[] nums) {
//        int len = nums.length;
//        int[] answer = new int[len];
//        for (int i = 0; i < len - 1; i++) {
//            answer[i] = nums[i + 1] * nums[i];
//        }
//
//        return answer;
//    }
}
