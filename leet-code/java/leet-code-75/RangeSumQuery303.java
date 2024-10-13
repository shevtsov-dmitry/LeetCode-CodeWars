void main() {
    NumArray arr = new NumArray(new int[]{-2,0,3,-5,2,1});
    arr.sumRange(2,5);
}

class NumArray {

    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(left == right + 1) {
                break;
            }
//            System.out.print(nums[left] + "\t");
            sum += nums[left];
            left++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */