import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

void main() {
    System.out.println(containsDuplicate(new int[]{1,2,3,1}));
}

boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int num : nums) {
        if (set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
}
