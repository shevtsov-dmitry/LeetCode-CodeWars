import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

void main() {
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]
    moveZeroes(new int[]{0, 1, 0, 3, 12});
}

public void moveZeroes(int[] nums) {
    Queue<Integer> q = new LinkedList<Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            q.offer(i);
        } else if (!q.isEmpty()) {
            swap(nums, q.remove(), i);
            q.offer(i);
        }
    }
}

public void swap(int[] nums, int i, int j) {
    int temp = nums[j];
    nums[j] = nums[i];
    nums[i] = temp;
}


