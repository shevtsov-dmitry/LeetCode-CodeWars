import java.util.*;

void main() {

}

public int longestConsecutive(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }
    TreeSet<Integer> treeSet = new TreeSet<>();
    for (int num : nums) {
        treeSet.add(num);
    }

    int max = 0;
    int curCount = 0;
    for (int num : treeSet) {
        if (treeSet.contains(num + 1)) {
            curCount++;
            max = Math.max(curCount, max);
        } else {
            curCount = 0;
        }
    }

    return max + 1;
}