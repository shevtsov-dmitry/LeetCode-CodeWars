package leet_code.java;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

    public static void main(String[] args) {
        int[] ints = new int[] { 1, 2, 3, 4 };
        productExceptSelf(ints);

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        int tempo = nums[0];
        fillPrefix(nums, n, prefix, tempo);

        tempo = nums[n - 1];
        fillPostfix(nums, n, postfix, tempo);

        calculateResult(nums, n, prefix, postfix);

        // log(nums, prefix, postfix);
        return nums;
    }

    static void calculateResult(int[] nums, int n, int[] prefix, int[] postfix) {
        for (int i = 0; i < n; i++) {
            if (i == 0)
                nums[i] = postfix[1];
            else if (i == n - 1)
                nums[i] = prefix[n - 2];
            else
                nums[i] = prefix[i - 1] * postfix[i + 1];
        }
    }

    static void fillPostfix(int[] nums, int n, int[] postfix, int tempo) {
        postfix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            tempo = tempo * nums[i];
            postfix[i] = tempo;
        }
    }

    static void fillPrefix(int[] nums, int n, int[] prefix, int tempo) {
        prefix[0] = nums[0];
        for (int i = 0; i < n - 1; i++) {
            tempo = tempo * nums[i + 1];
            prefix[i + 1] = tempo;
        }
    }

    // static void log(int[] nums, int[] prefix, int[] postfix) {
    //     System.out.println("prefix: " + Arrays.toString(prefix));
    //     System.out.println("postfix: " + Arrays.toString(postfix));
    //     System.out.println("nums: " + Arrays.toString(nums));
    // }

}
