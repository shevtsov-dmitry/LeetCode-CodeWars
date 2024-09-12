import java.util.*;

void main() {
    // Input: nums = [1,1,1,2,2,3], k = 2
    // Output: [1,2]
    int[] answer = null;

//    answer = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
//    assert Arrays.toString(answer).equals(Arrays.toString(new int[]{2, 1})) : Arrays.toString(answer);

//    answer = topKFrequent(new int[]{1, 1, 1, 2, 2, 2, 3}, 2);
//    assert Arrays.toString(answer).equals(Arrays.toString(new int[]{2, 1})) : Arrays.toString(answer);

    answer = topKFrequent(new int[] {4,1,-1,2,-1,2,3}, 2);
    System.out.println(Arrays.toString(answer));
    assert Arrays.toString(answer).equals(Arrays.toString(new int[]{2, -1})) : Arrays.toString(answer);

//    answer = topKFrequent(new int[]{-1, -1}, 1);
//    assert Arrays.toString(answer).equals(Arrays.toString(new int[]{-1})) : Arrays.toString(answer);
//
//    answer = topKFrequent(new int[]{1, 2}, 2);
//    assert Arrays.toString(answer).equals(Arrays.toString(new int[]{2, 1})) : Arrays.toString(answer);

//    answer = topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
}

public int[] topKFrequent(int[] nums, int limit) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        int amount = map.getOrDefault(num, 0);
        map.put(num, amount + 1);
    }

    TreeMap<Integer, ArrayDeque<Integer>> sortedMap = new TreeMap<>();
    for (var entry : map.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();

        var stack = sortedMap.getOrDefault(value, new ArrayDeque<>());
        stack.push(key);
        sortedMap.put(value, stack);
    }

    int[] answer = new int[limit];
    int idx =0;
    for (var stack : sortedMap.descendingMap().values()) {
        while (!stack.isEmpty()) {
            if (limit == 0) {
                return answer;
            }
            limit--;
            answer[idx] = stack.pop();
            idx++;
        }
    }

    return answer;
}