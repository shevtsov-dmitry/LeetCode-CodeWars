package Leet_Code_Problems.Java;

import java.util.*;

public class RemoveElement27 {
    public static void main(String[] args) {
        int a = removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
        System.out.println("a = " + a);
    }

    public static int removeElement(int[] nums, int val) {

        //INPUT
        // [0,1,2,2,3,0,4,2]
        //Expected
        //[0,1,4,0,3]

        int increment = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[increment] = nums[i];
                increment++;
            }

        }
        return increment;
    }

}
