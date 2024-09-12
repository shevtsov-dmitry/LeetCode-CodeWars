import java.util.Arrays;

public void main(String[] args) {
    int[] nums = {1, 2, 3};
    generatePermutations(nums);
}

public void generatePermutations(int[] nums) {
    int n = nums.length;
    boolean[] used = new boolean[n];
    int[] currentPermutation = new int[n];
    generatePermutationsHelper(nums, used, currentPermutation, 0);
}

private void generatePermutationsHelper(int[] nums, boolean[] used, int[] currentPermutation, int index) {
    if (index == nums.length) {
        System.out.println(Arrays.toString(currentPermutation));
        return;
    }

    for (int i = 0; i < nums.length; i++) {
        if (!used[i]) {
            used[i] = true;
            currentPermutation[index] = nums[i];
            generatePermutationsHelper(nums, used, currentPermutation, index + 1);
            used[i] = false;
        }
    }
}
