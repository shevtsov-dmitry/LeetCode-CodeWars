import java.util.*;

void main() {
// Input: nums = [2,1,5,0,4,6]
// Output: true
// Explanation: The triplet (3, 4, 5) is valid because 
// nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
//    boolean b = increasingTriplet(new int[]{2, 1, 5, 0, 4, 6});
    boolean b = increasingTriplet(new int[]{0,4,2,1,0,-1,-3});
    System.out.println(b);
}


// finding (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]
public boolean increasingTriplet(int[] nums) {
    assert nums.length > 3;
    int remI = 0;
    int remJ = 0;
    int remK = 0;
    int[] rememberTraversedValues = new int[nums.length];
    for (int i = 0, j = i + 1, k = j + 1; k < nums.length; i++, j++, k++) {
        if (i == 0) {
            remI = nums[i];
            remJ = nums[j];
            remK = nums[k];
            rememberTraversedValues[0] = remI;
            rememberTraversedValues[1] = remJ;
            rememberTraversedValues[2] = remK;
            continue;
        }
        rememberTraversedValues[k] = nums[k];
        remI = Math.min(remI, nums[i]);
        remK = Math.max(remK, nums[k]);
        boolean win = remI < remJ && remJ < remK;
        if (remJ <= remI || remJ >= remK) {
            remJ = nums[j];
            if (win) return true;
            else {
                for (int l = 0; l < k; l++) {
                    if (remI < nums[l] && nums[l] < remK) {
                        remJ = nums[l];
                    }
                    if (win) return true;
                }
            }
        }
        if (win) {
            return true;
        }
    }
    return false;
}