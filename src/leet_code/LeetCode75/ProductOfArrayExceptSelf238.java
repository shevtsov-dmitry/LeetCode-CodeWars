import java.util.Arrays;

void main() {
   // Input: nums = [1,2,3,4]
   // Output: [24,12,8,6]
    int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});
    System.out.println(Arrays.toString(ints));
}

public int[] productExceptSelf(int[] nums) {
    int[] prefixArray = new int[nums.length];
    prefixArray[0] = 1;
    for (int i = 1; i < nums.length; i++) {
        prefixArray[i] = nums[i - 1] * prefixArray[i - 1];
    }	
    int rememberPostfixVal = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
    	nums[i + 1] = rememberPostfixVal * nums[i + 1];
        rememberPostfixVal = nums[i + 1];
        prefixArray[i] = prefixArray[i] * rememberPostfixVal;
    }
    return prefixArray;
}

