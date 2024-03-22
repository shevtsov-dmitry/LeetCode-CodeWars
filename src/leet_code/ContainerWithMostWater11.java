void main() {
    int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    maxArea(arr);
}

public int maxArea(int[] height) {
    int max = 0;
    for (int l = 0, r = height.length - 1; l != r; ) {
        if (height[l] > height[r]) {
            max = Math.max(height[r] * ( r - l), max) ;
            r--;
        } else {
            max = Math.max(height[l] * ( r - l), max) ;
            l++;
        }
    }
    return max;
}