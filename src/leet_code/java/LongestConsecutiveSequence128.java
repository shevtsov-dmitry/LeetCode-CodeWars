package leet_code.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int i = longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        assert i == 9 : "expected 9 | actual %d".formatted(i);
        int i1 = longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});
        assert i1 == 4 : "expected 4 | actual %d".formatted(i1);
        int i2 = longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6});
        assert i2 == 7 : "expected 7 | actual %d".formatted(i2);
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int counter = 0;
                while(set.contains(num + counter)){
                    counter++;
                }
                max = Math.max(counter, max);
            }
        }
        return max;
    }
}
