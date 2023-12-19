package leet_code.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> strings = List.of("lint","code","love","you");
        String encodedMessage = encode(strings);
        System.out.println("encodedMessage = " + encodedMessage);
        List<String> result = decode(encodedMessage);
        System.out.println("result = " + result);
    }

    public static String encode(List<String> strs) {
        var sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append("б");
        }
        return sb.toString();
    }


    public static List<String> decode(String str) {
        return Arrays.stream(str.split("б")).toList();
    }
}
