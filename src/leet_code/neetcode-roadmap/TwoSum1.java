import java.util.HashMap;
import java.util.Map;

void main() {
    // Input: nums = [2,7,11,15], target = 9
    int[] val = twoSum(new int[]{2, 7, 11, 15}, 9);
    System.out.printf("answer: %d and %d",val[0],val[1]);
}

int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map =new HashMap<>(nums.length);

    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        if (map.containsKey(target - num)){
            return new int[] {map.get(target-num), i};
        }
        map.put(num, i);
    }

    return new int[]{};
}
