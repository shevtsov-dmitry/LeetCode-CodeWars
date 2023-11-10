package leet_code.java;

import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6};
        int k = 10;
        int[] ints = topKFrequent(nums, k);
        System.out.println("ints = " + Arrays.toString(ints));
    }
    /*Input: nums = [1,1,1,2,2,3], k = 2
    Output: [1,2]*/
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("map = " + map);
        List<Integer> maxOccurrences = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int max = Integer.MIN_VALUE;
            int rememberKey = 0;
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                Integer key = integerIntegerEntry.getKey();
                Integer value = integerIntegerEntry.getValue();
                if(value > max){
                    max = value;
                    rememberKey = key;
                }
            }
            map.remove(rememberKey);
            maxOccurrences.add(rememberKey);
        }
        return maxOccurrences.stream().mapToInt(Integer::intValue).toArray();
    }
}
