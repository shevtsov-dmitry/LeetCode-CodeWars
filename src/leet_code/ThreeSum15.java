import java.util.*;
import java.util.stream.Collectors;

void main() {
    // Input: nums = [-1,0,1,2,-1,-4]
    // Output: [[-1,-1,2],[-1,0,1]]
    int[] nums = { -1, 0, 1, 2, -1, -4 };
    List<List<Integer>> list = threeSum(nums);
    System.out.println(list);
}

public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> answers = new HashSet<>();
    List<Integer> list = new ArrayList<>(3);
    Arrays.sort(nums);
    for (int backIdx = nums.length - 1; backIdx >= 0; backIdx--) {
        for (int i = 0; i < backIdx; i++) {
            for (int j = i + 1; j < backIdx; j++) {
                list.add(nums[backIdx]);
                list.add(nums[i]);
                list.add(nums[j]);
                if (list.size() != 3) {
                    list.clear();
                    break;
                }
                if (list.stream().mapToInt(Integer::intValue).sum() == 0) {
                    answers.add(new ArrayList<>(list));
                    list.clear();
                }
                list.clear();
            }

        }

    }
    return answers.stream().toList();
}
