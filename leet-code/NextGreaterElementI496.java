import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

void main() {
    // Output: [-1,3,-1]
    int[] result = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});
    System.out.println("result = " + Arrays.toString(result));
}

int[] nextGreaterElement(int[] nums1, int[] nums2) {

    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    for (int num : nums2) {
        while (!stack.isEmpty() && stack.peek() < num) {
            int value = stack.pop();
            map.put(value, num);
        }
        stack.push(num);
    }

    for (int i = 0; i < nums1.length; i++) {
        nums1[i] = map.getOrDefault(nums1[i], -1);
    }

    return nums1;
}

//    public  int[] nextGreaterElement(int[] findNums, int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
//        Stack<Integer> stack = new Stack<>();
//        for (int num : nums) {
//            while (!stack.isEmpty() && stack.peek() < num)
//                map.put(stack.pop(), num);
//            stack.push(num);
//        }
//        for (int i = 0; i < findNums.length; i++)
//            findNums[i] = map.getOrDefault(findNums[i], -1);
//        return findNums;
//    }

