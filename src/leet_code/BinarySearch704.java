void main() {
    /*Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4*/
    int[] nums = {-1,0,3,5,9,12};
    int search = search(nums, 9);
    System.out.println(search);
}

public int search(int[] nums, int target) {
    int l = 0, r = nums.length - 1, mid = -1;
    while (l <= r) {
        mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] < target) {
            l = mid + 1;
        }
        else {
            r = mid -1;

        }
    }
    return -1;
}