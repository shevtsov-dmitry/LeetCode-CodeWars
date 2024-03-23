//  2,7,11,15

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

void main() {
    int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
    System.out.println(Arrays.toString(ints));
}
public int[] twoSum(int[] numbers, int target) {
    int i = 0, j = numbers.length - 1;
    while (i <= j) {
        if (numbers[j] + numbers[i] == target) {
            return new int[]{i + 1,j + 1};
        }
        if (numbers[i] + numbers[j] > target) j--;
        else i++;
    }

    return new int[]{};
}
