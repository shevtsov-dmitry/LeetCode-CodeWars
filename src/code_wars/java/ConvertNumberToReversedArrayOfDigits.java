package code_wars;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.String.valueOf;

public class ConvertNumberToReversedArrayOfDigits {
    public static void main(String[] args) {
//        35231 => [1,3,2,5,3]
//        0 => [0]
        digitize(35231);
    }
    public static int[] digitize(long n) {
        int length = (int) (Math.log10(n) + 1);
        int[] arr = new int[length];
        int multiplier = 10;
        for (int i = 0; i < length; i++) {
            int oneNumber = (int) (n % multiplier);
            arr[i] = oneNumber;
            System.out.println("oneNumber = " + oneNumber);
            System.out.println("n = " + n);
            n -= oneNumber;
            
            multiplier*=10;
        }
        System.out.println("arr = " + Arrays.toString(arr));
        return arr;
    }
}
