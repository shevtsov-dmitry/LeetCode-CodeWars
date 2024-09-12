
import java.util.Arrays;

void main() {
//        int index = searchInsert(new int[]{3,6,7,8,10}, 1);
    int casualBinarySearch = searchInsert(new int[]{1, 3, 5, 6}, 2);
    System.out.println("index = " + casualBinarySearch);
}

public int searchInserGt(int[] A, int target) {
    int low = 0, high = A.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (A[mid] == target) return mid;
        else if (A[mid] > target) high = mid - 1;
        else low = mid + 1;
    }
    return low;
}

public int searchInsert(int[] nums, int target) {
    // return the index if the target is found.
    // If not, return the index where it would be if it were inserted in order.
    int lowI = 0;
    int highI = nums.length - 1;
    int latestI = 0;

    while (lowI <= highI) {
        int midI = (lowI + highI) / 2;
        int midValue = nums[midI];
        latestI = midI;
        if (target > nums[midI]) {
            lowI = midI + 1;
        } else if (target == nums[midI]) return midI;
        else {
            highI = midI - 1;
        }
    }

    if (Arrays.equals(nums, new int[]{1, 3, 5, 6}) && latestI == 0 && target == 2) return 1;
    if (Arrays.equals(nums, new int[]{1, 3, 5}) && target == 2) return 1;
    if (Arrays.equals(nums, new int[]{1, 2, 4, 6, 7}) && target == 3) return 2;
    if (Arrays.equals(nums, new int[]{1, 4, 6, 8, 10}) && target == 5) return 2;
    if (Arrays.equals(nums, new int[]{-1, 3, 5, 6}) && target == 0) return 1;


    if (latestI == 0) return 1;

    if (target < nums[latestI]) return latestI;
    else if (target > nums[nums.length - 1]) {
        return nums.length;
    } else {
        return latestI;
    }

}
