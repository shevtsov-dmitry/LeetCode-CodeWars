void main() {
//    Input: nums = [1,2,3,4,5]
//    Output: true
    boolean b = increasingTriplet(new int[]{1, 2, 3, 4, 5});
    System.out.println(b);
}

//(i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]
public boolean increasingTriplet(int[] nums) {
    int maxI = Integer.MAX_VALUE;
    int maxJ = Integer.MAX_VALUE;
    for (int num : nums) {
        if (num <= maxI) {
            maxI = num;
        } else if (num <= maxJ) {
            maxJ = num;
        } else {
            return true;
        }
    }
    return false;
}