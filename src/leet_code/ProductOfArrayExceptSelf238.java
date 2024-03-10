import java.util.Arrays;

void main() {
//    Input: nums = [1,2,3,4]
//    Output: [24,12,8,6]
    productExceptSelf(new int[]{1, 2, 3, 4});
}

public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
    int[] prefix = new int[length];
    int[] postfix = new int[length];
    prefix[0] = 1;
    postfix[length - 1] = 1;
    for (int i = length - 1; i > 0; i--) {
        postfix[i - 1] = postfix[i] * nums[i];
    }
    for (int i = 0; i < length - 1; i++) {
        prefix[i + 1] = prefix[i] * nums[i];
        nums[i] = prefix[i] * postfix[i];
    }
    return nums;
}