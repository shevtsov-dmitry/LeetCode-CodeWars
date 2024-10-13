void main() {
//    Input: height = [1,8,6,2,5,4,8,3,7]
//    Output: 49
    int i = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    System.out.println(i);
}

public int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    for (int l = 0, r = height.length - 1; l <= r; ) {
        int min = Math.min(height[l], height[r]);
        int volume = (int) Math.ceil((r - l) * min);
        if (volume > max) {
            max = volume;
            l++;
        } else {
            r--;
        }
    }
    return max;
}