import java.util.Arrays;

void main() {
    findMedianSortedArrays(new int[]{12, 3}, new int[]{1, 23, 4});
}


public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    // created new array to combine two arrays in it
    int[] mergedArr = new int[nums1.length + nums2.length];
    // combining them
    System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
    System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);
    // log
    Arrays.sort(mergedArr);
    System.out.println(Arrays.toString(mergedArr));
    // if length is even
    if (mergedArr.length % 2 == 0) {
        return (mergedArr[mergedArr.length / 2] + mergedArr[mergedArr.length / 2 - 1]) / 2D;
    }
    // if odd
    else {
        return mergedArr[mergedArr.length / 2];
    }
}
