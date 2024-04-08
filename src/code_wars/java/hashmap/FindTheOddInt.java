package code_wars.java.hashmap;

import java.lang.classfile.components.ClassPrinter;
import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        /* 5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}) */
        int answer = findIt(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 });
        System.out.println(answer);
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int j = map.getOrDefault(a[i], 0);
            map.put(a[i], j += 1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            Integer key = integerIntegerEntry.getKey();
            Integer value = integerIntegerEntry.getValue();
            if (value % 2 == 1)
                return key;
        }
        return 0;
    }
}
