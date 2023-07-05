package Leet_Code_Problems.Java;

import java.util.*;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] arr = intersection(new int[]{1,2,2,1}, new int[]{2,2});
        int[] secArr= intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // create and fill sets
        Set<Integer> numsSet1 = new HashSet<>();
        Set<Integer> numsSet2 = new HashSet<>();
        Arrays.stream(nums1).forEach(numsSet1::add);
        Arrays.stream(nums2).forEach(numsSet2::add);

        // store similar values to new list
        List<Integer> list = new ArrayList<>();
        for (Integer val : numsSet1) {
            if(numsSet2.contains(val)) list.add(val);
        }

        // return int[] from list
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
