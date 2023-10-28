package code_wars.java.common;

import java.util.HashMap;
import java.util.Map;

public class StringEndsWith {
    /*
    * solution('abc', 'bc') // returns true
    solution('abc', 'd') // returns false*/
    public static void main(String[] args) {
        solution("abc", "bc");
    }

    public static boolean solution(String str, String ending) {
        if(str.isEmpty() || str.length() < ending.length())
            return false;

        int len = ending.length();
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length-len; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return ending.contentEquals(sb);
    }

}
