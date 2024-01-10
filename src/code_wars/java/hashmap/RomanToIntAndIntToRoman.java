package code_wars.java.hashmap;

import java.util.*;


public class RomanToIntAndIntToRoman {
    /* to roman:
            2000 -> "MM"
            1666 -> "MDCLXVI"
            1000 -> "M"
            400 -> "CD"
            90 -> "XC"
            40 -> "XL"
            1 -> "I"

    from roman:
            "MM"      -> 2000
            "MDCLXVI" -> 1666
            "M"       -> 1000
            "CD"      -> 400
            "XC"      -> 90
            "XL"      -> 40
            "I"       -> 1*/

    final static Map<String, Integer> ROMAN_TO_ARABIC = new HashMap<>(
            Map.of("I", 1,
                    "IV", 4,
                    "V", 5,
                    "VI", 6,
                    "X", 10,
                    "L", 50,
                    "C", 100,
                    "D", 500,
                    "M", 1000
            )
    );

    final static Map<Integer, String> ARABIC_TO_ROMAN = new HashMap<>(
            Map.of(1, "I",
                    4, "IV",
                    5, "V",
                    6, "VI",
                    10, "X",
                    50, "L",
                    100, "C",
                    500, "D",
                    1000, "M"
            )
    );

    static void testToRoman() {
        assert toRoman(2000).equals("MM") : "(2000) == MM";
        assert toRoman(1666).equals("MDCLXVI") : "(1666) == MDCLXVI";
        assert toRoman(1000).equals("M") : "(1000) == M";
        assert toRoman(400).equals("CD") : "(400) == CD";
        assert toRoman(90).equals("XC") : "(90) == XC";
        assert toRoman(40).equals("XL") : "(40) == XL";
        assert toRoman(1).equals("I") : "(1) == I";
    }

    public static String toRoman(int n) {
        Stack<Integer> arabicRepresentationNums = new Stack<>();
        Stack<Integer> numberComponents = new Stack<>();
        List<Integer> mapNums = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : ROMAN_TO_ARABIC.entrySet()) {
            Integer value = stringIntegerEntry.getValue();
            mapNums.add(value);
        }
        Collections.sort(mapNums);
        for (Integer mapNum : mapNums) {
            // STOPSHIP: 16.10.2023
            arabicRepresentationNums.push(mapNum);
        }
        findNumParts(numberComponents, arabicRepresentationNums, n);

        Collections.reverse(numberComponents);

        var answer = new StringBuilder();
        while (!numberComponents.isEmpty()) {
            int num = numberComponents.pop();
            answer.append(ARABIC_TO_ROMAN.get(num));
        }

        return answer.toString();
    }

    private static void findNumParts(Stack<Integer> stack, Stack<Integer> arabicRepresentationNums, int n) {
        while (n >= 0) {
            if (arabicRepresentationNums.isEmpty()) {
//                System.out.println(STR. "arabicRepresentationNums is empty but n != 0. n = \{ n }" );
                break;
            } else if (n - arabicRepresentationNums.peek() >= 0) {
                n -= arabicRepresentationNums.peek();
                stack.push(arabicRepresentationNums.peek());
            } else {
                arabicRepresentationNums.pop();
            }
        }
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }

    public static void main(String[] args) {
//        testToRoman();
        System.out.println(toRoman(58));
    }
}