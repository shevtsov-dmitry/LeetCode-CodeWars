void main() {
    int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
    };
    boolean b = searchMatrix(matrix, 3);
    System.out.println(b);
}

public boolean searchMatrix(int[][] matrix, int target) {
    int arrayToBSIndex = 0;
    if (matrix.length != 0) {
        for (int i = 0; i < matrix.length - 1; i++) {
            if (matrix[i][0] <= target && matrix[i + 1][0] >= target) {
                arrayToBSIndex = i;
            }
        }
    }
    return bs(matrix[arrayToBSIndex], target);
}

private boolean bs(int[] nums, int target) {
    int l = 0, r = nums.length - 1, mid;
    while (l <= r) {
        mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return true;
        } else if (nums[mid] < target) {
            l = mid + 1;
        } else r = mid - 1;
    }
    return false;
}