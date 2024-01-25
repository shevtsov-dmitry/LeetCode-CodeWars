package leet_code.java;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber17 {

    public static void main(String[] args) {
        /*
         * Input: digits = "23"
         * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
         */
        letterCombinations("23");

    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer, String[]> numberLetters = new HashMap<>();
        numberLetters.put(2, new String[]{"a", "b", "c"});
        numberLetters.put(3, new String[]{"d", "e", "f"});
        numberLetters.put(4, new String[]{"g", "h", "i"});
        numberLetters.put(5, new String[]{"j", "k", "l"});
        numberLetters.put(6, new String[]{"m", "n", "o"});
        numberLetters.put(7, new String[]{"p", "q", "r", "s"});
        numberLetters.put(8, new String[]{"t", "u", "v"});
        numberLetters.put(9, new String[]{"w", "x", "y", "z"});

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
            list.add(numberLetters.get(digit));
        }
        Collections.reverse(list);

        List<String> collected = new ArrayList<>();
        for (String[] sublist : list) {
            if (collected.isEmpty()) {
                Collections.addAll(collected, sublist);
            } else {
                var tempList = new ArrayList<String>();
                for (String cur : sublist) {
                    for (String prev : collected) {
                        tempList.add(cur + prev);
                    }
                }
                collected = tempList;

            }

        }

        System.out.println(collected);
        return collected;
    }


}
