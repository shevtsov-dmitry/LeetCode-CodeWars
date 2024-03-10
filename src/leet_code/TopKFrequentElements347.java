import java.util.*;

void main() {
//    Any order allowed
//    Input: nums = [1,1,1,2,2,3], k = 2
//    Output: [1,2]
//    int[] nums = {4, 1, -1, 2, -1, 2, 3};
    int[] nums = {1,1,1,2,2,3};
    int[] ints = topKFrequent(nums, 2);
    System.out.println(Arrays.toString(ints));
}

public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    Arrays.stream(nums)
            .forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
    List<Integer>[] buckets = new List[(int) Math.pow(10, 5)];
    for (Map.Entry<Integer, Integer> kv : map.entrySet()) {
        Integer key = kv.getKey();
        Integer value = kv.getValue();
        if(buckets[value] == null) {
            buckets[value] = new ArrayList<>();
        }
        buckets[value].add(key);
    }
    List<Integer> resultat = new ArrayList<>(k);
    int times = 0;
    for (int i = buckets.length - 1; i >= 0; i--) {
        if(buckets[i] != null && times < k) {
            resultat.addAll(buckets[i]);
            times++;
        }
    }
    return resultat.stream().mapToInt(Integer::intValue).toArray();
}