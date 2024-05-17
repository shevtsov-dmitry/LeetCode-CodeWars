import java.util.HashMap;
import java.util.Map;

void main() {
//    Input: nums = [1,2,3,4], k = 5
//    Output: 2
//    Explanation: Starting with nums = [1,2,3,4]:
//    - Remove numbers 1 and 4, then nums = [2,3]
//    - Remove numbers 2 and 3, then nums = []
    int i = maxOperations(new int[]{1, 2, 3, 4}, 5);
    System.out.println(i + " expect 2");
     i = maxOperations(new int[]{3,1,3,4,3}, 6);
    System.out.println(i + " expect 1");
     i = maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2}, 3);
    System.out.println(i + " expect 4");
    i = maxOperations(new int[]{3,5,1,5}, 2);
    System.out.println(i + " expect 0");
}

public int maxOperations(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int matchesAmount = 0;
    for (int num : nums) {
        if (num <= k) map.put(num, map.getOrDefault(num, 0) + 1);
        if (map.containsKey(k - num) && map.get(k - num) >= 1) {
            if (num == k - num && map.get(num) > 1) {
                map.put(k - num, map.get(k - num) - 3);
                matchesAmount++;
            } else {
                map.put(k - num, map.get(k - num) - 1);
                map.put(num, map.get(num) - 1);
                matchesAmount++;
            }
        }
    }
    return matchesAmount;
}