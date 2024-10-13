import java.util.Arrays;

void main() {
    // Input: nums = [1,2,4,6]
    // Output: [48,24,12,8]
    productExceptSelf(new int[]{1,2,4,6});
}

public int[] productExceptSelf(int[] nums) {
    int len = nums.length;
    int[] prefix = new int[len];
    int[] postfix = new int[len];

    prefix[0] = nums[0];
    for(int i = 1; i < len - 1; i++) {
        prefix[i] = prefix[i -1] * nums[i];
    }

    postfix[len - 1] = nums[len - 1];
    for(int i = len - 2; i > 0; i--) {
        postfix[i] = postfix[i + 1] * nums[i];
    }

    print(prefix);
    print(postfix);

    for(int i = 0; i < len - 2; i++) {
        nums[i] = prefix[i] * postfix[i + 2];
    }

    print(nums);

    return null;
}
void print(int[] arr) {
    System.out.println(Arrays.toString(arr));
}
