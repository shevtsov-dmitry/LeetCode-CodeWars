import java.util.*;

void main() {
    // Input: nums = [-1,0,1,2,-1,-4]
    // Output: [[-1,-1,2],[-1,0,1]]
    int[] nums = {-4, -1, -1, 0, 1, 2};
    int[] nu = {0, 0, 0};
    var list = threeSum(nums);
    var li = threeSum(nu);
    System.out.println(list);
    System.out.println(li);
    int[] case3 = {0, 0, 0, 0};
    var case3ans = threeSum(case3);
    System.out.println(case3ans);
    int[] case4 = {1, 2, -2, -1};
    System.out.println(threeSum(case4));
}

public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        int r = nums.length - 1;
        int l = i + 1;

        while (l < r) {
            int sum = nums[i] + nums[l] + nums[r];
            if (sum == 0) {
                result.add(List.of(nums[i], nums[l], nums[r]));
                l++;
                r--;
            }
            else if (sum < 0) l++;
            else r--;
        }
    }
    return result.stream().toList();
}