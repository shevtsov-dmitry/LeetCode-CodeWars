package leet_code.Java;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34 {
    public static void main(String[] args) {
//        Input: nums = [5,7,7,8,8,10], target = 8
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        System.out.println("searchRange(nums, target) = " + Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int start = -1, end = -1;
        int numberIndex = Arrays.binarySearch(nums, target);
        System.out.println("numberIndex = " + numberIndex);
        if (numberIndex < 0) {
            return new int[]{start, end};
        }

        int back = numberIndex;
        int forward = numberIndex;

        while(back >= 0 && nums[back] == target){
            start = back;
            back--;
        }

        while(forward < nums.length && nums[forward] == target){
            end = forward;
            forward++;
        }

        // If target is not found in the array, return [-1, -1].
        return new int[]{start, end};
    }
}
