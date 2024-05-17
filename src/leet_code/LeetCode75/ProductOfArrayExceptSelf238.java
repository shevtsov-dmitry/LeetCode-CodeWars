import java.util.Arrays;

void main() {
    boolean equals = Arrays.equals(new int[]{24, 12, 8, 6}, productExceptSelf(new int[]{1, 2, 3, 4}));
    System.out.println(equals);
}

public int[] productExceptSelf(int[] nums) {
    int[] aidArr = new int[nums.length];
    aidArr[0] = 1;
    for (int i = 1; i < nums.length; i++) {
        aidArr[i] = aidArr[i -1] * nums[i -1 ];
    }
    int rememberPrev = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
        int rememberCurNum = nums[i];
        nums[i] = aidArr[i] * rememberPrev;
        rememberPrev *= rememberCurNum;
    }
    return nums;
}
