//  2,7,11,15

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

void main() {
    int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(ints));
}

public int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
        if (map.containsKey(target - numbers[i])) {
            int[] ints = {map.get(target - numbers[i]) + 1, i + 1};
            Arrays.sort(ints);
            return ints;
        } else if (map.containsKey(target - numbers[j])) {
            int[] ints = {map.get(target - numbers[j]) + 1, j + 1};
            Arrays.sort(ints);
            return ints;
        }
        map.put(numbers[i], i);
        map.put(numbers[j], j);

    }
    return new int[]{};
}