package leet_code.Java;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,3,3,4,3,2,4,2};
        int[] oneTwoThreeFour = new int[]{1,2,3,4};

        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(oneTwoThreeFour));
    }
    private static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}
