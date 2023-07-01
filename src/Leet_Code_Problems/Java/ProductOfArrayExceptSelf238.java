package Leet_Code_Problems.Java;

import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
//        Output: [24,12,8,6]
//        int[] nums = new int[]{0, 0};/**/
//        Output: [0,0,9,0,0]
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] resArr = new int[nums.length - 1];
        int backwardsIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

        }
        return null;
    }
}
