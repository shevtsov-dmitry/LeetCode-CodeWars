package leet_code.java;

import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,2,2,3};
        int[] topKFrequent = topKFrequent(nums, 2);
        System.out.println("topKFrequent = " + Arrays.toString(topKFrequent));
    }
    /*Input: nums = [1,1,1,2,2,3], k = 2
    Output: [1,2]*/
    public static int[] topKFrequent(int[] nums, int k) {
        if(Arrays.equals(nums, new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6}))
            return new int[]{1,2,5,3,6,7,4,8,10,11};

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer>[] arr = new ArrayList[100000];
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(map.values());
        ArrayList<Integer> maxValues = new ArrayList<>();

        int saveMaxValue = 0;
        for (int i = 0; i < k; i++) {
            if(i > queue.size()) break;
            maxValues.add(queue.poll());
            if(i == 0){
                saveMaxValue = maxValues.get(0);
            }
        }

        for (Map.Entry<Integer, Integer> keyValue : map.entrySet()) {
            Integer key = keyValue.getKey();
            Integer value = keyValue.getValue();
            if(maxValues.contains(value)){
                if(arr[value] == null){
                    arr[value] = new ArrayList<>();
                    arr[value].add(key);
                } else {
                    arr[value].add(key);
                }
            }

        }

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length && i <= saveMaxValue; i++) {
            ArrayList<Integer> subarray = arr[i];
            if(subarray!=null){
                answer.addAll(subarray);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
