package leet_code.Java;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne66 {
    public static void main(String[] args) {
        int[] arr = betterPlusOne(new int[]{1,2,3});
        int[] nine = betterPlusOne(new int[]{9,9});
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("nine = " + Arrays.toString(nine));
    }

    public static int[] plusOne(int[] digits) {
        var sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        var number = new BigInteger(sb.toString());
        number = number.add(BigInteger.valueOf(1));
        String resultNumString = String.valueOf(number);
        int[] resultArray = new int[resultNumString.length()];
        for (int j = 0; j < resultArray.length; j++) {
            resultArray[j] = Integer.parseInt(String.valueOf(resultNumString.charAt(j)));
        }

        return resultArray;
    }

    public static int[] betterPlusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] arr = Arrays.copyOf(digits, digits.length + 1);
        arr[0] = 1;
        return arr;

    }
}
