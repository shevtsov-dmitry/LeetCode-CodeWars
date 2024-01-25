package leet_code.java;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber268 {
    public static void main(String[] args) {
//        int v = myMissingNumber(new int[]{9,6,4,2,3,5,7,0,1});
//        System.out.println("v = " + v);
//        System.out.println("=== NEXT ===");
//        int d = myMissingNumber(new int[]{0,1});
//        System.out.println("d = " + d);
        int v = missingNumber(new int[]{9,6,4,2,3,5,7,0,1});
        System.out.println("v = " + v);
    }

    public static int myMissingNumber(int[] nums){
        List<Integer> check0and1 = new ArrayList<Integer>();
        Arrays.stream(nums).forEach(check0and1::add);
        if(!check0and1.contains(0)) return 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] - 1) {
                return nums[i] + 1;
            }

        }

        return nums[nums.length - 1] + 1;
    }

    public static int missingNumber(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 1; i <= nums.length; i++) {
            sum1 += i;
        }
        for(int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        int[] myArr = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println("sum is: " + Arrays.stream(myArr).sum());
        return sum1 - sum2;
    }
}
