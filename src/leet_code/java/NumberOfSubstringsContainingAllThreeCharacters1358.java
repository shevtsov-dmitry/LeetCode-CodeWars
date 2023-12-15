package leet_code.java;

import java.util.Stack;
import java.util.StringJoiner;

public class NumberOfSubstringsContainingAllThreeCharacters1358 {
    //    Input: s = "abcabc"
    //    Output: 10
    //    Explanation: The substrings containing at least one occurrence of the characters a, b and c are
    //    "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
    public static void main(String[] args) {
        String string = "abcabc";
        numberOfString(string);
    }

    public static int numberOfString(String s) {
        int countString = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            for (int j = 0; j < s.length(); j++) {
                if(i == j) continue;

            }
        }

        return countString;

    }
}
