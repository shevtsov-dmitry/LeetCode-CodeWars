import java.util.Arrays;

void main() {
    moveZeroes(new int[]{0, 1, 0, 3, 12});
}

public void moveZeroes(int[] nums) {
    int remWhereZero = 0;
    for (int cur = 0; cur < nums.length; cur++) {
        if (nums[cur] != 0) {
            remWhereZero++;
            int temp = nums[cur];
            nums[cur] = nums[remWhereZero];
            nums[remWhereZero] = temp;
        }
    }
    System.out.println(Arrays.toString(nums));
}