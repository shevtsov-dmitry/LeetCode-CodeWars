package code_wars.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToLongFunction;

public class CountIpAddresses {
    public static void main(String[] args) {
        long result = ipsBetween("20.0.0.10", "20.0.1.0");
        System.out.println("result = " + result);
    }

    /* ALGORITHM
    * First IP address: "20.0.0.10"
    Decimal representation: (20 * 256^3) + (0 * 256^2) + (0 * 256^1) + 10 = 336855050

    Second IP address: "20.0.1.0"
    Decimal representation: (20 * 256^3) + (0 * 256^2) + (1 * 256^1) + 0 = 336855296

    Now, subtract the smaller decimal value from the larger decimal value:

    336855296 - 336855050 = 246

    So, there are 246 IP addresses between "20.0.0.10" and "20.0.1.0".
    * */
    // The last address will always be greater than the first one.
    public static long ipsBetween(String start, String end) {
        long[] startNums = new long[4];
        long[] endNums = new long[4];
        parseLongArray(start, startNums);
        parseLongArray(end, endNums);
        return countArrayIpValue(endNums) - countArrayIpValue(startNums);
    }

    private static long countArrayIpValue(long[] array) {
        int multiplier = 3; // Decimal representation: (20 * 256^3) + (0 * 256^2) + (0 * 256^1) + 10 = 336855050
        long sum = 0;
        for (long i : array) {
            sum += i * Math.pow(256, multiplier);
            multiplier--;
        }
        return sum;
    }

    private static void parseLongArray(String ip, long[] array) {
        int arrayIndex = 0;
        int pointerStartOfNum = 0;
        ip = ip + ".";
        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == '.') {
                var number = ip.substring(pointerStartOfNum, i);
                array[arrayIndex] = Integer.parseInt(number);
                pointerStartOfNum = i + 1;
                arrayIndex++;
            }
        }
        System.out.println("ip = " + ip + ", array = " + Arrays.toString(array));
    }


}
