package leet_code.java;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4};
        productExceptSelf(ints);

    }

    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] util = new int[n];
        util[n - 1] = 1;

        int tempo = nums[n - 1];
        fillUtilArray(nums, tempo, util);
        tempo = nums[0];
        fillNumsArray(nums, tempo);



        System.out.println(STR."nums = \{Arrays.toString(nums)}");
        System.out.println(STR."util = \{Arrays.toString(util)}");
        return nums;
    }

    public static void fillNumsArray(int[] nums, int tempo) {
        for (int i = 0; i < nums.length - 1; i++) {
            tempo = tempo * nums[i + 1];
            nums[i + 1] = tempo;
        }
    }

    public static void fillUtilArray(int[] nums, int tempo, int[] arr) {
        for (int i = nums.length - 2; i >= 0; i--) {
            tempo = tempo * nums[i];
            arr[i] = tempo;
        }
    }

}
