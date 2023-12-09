package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePermutations {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = generatePermutations(str);
        permutations.forEach(System.out::println);
    }

    private static List<String> generatePermutations(String str) {
        List<String> perms = new ArrayList<>();
        generatePerms(str, perms, 0);
        return perms;
    }

    private static void generatePerms(String str, List<String> allPerms, int start) {
        if(start == str.length()){
            allPerms.add(str);
        } else {
            for (int i = start; i < str.length(); i++) {
                str = swap(str, start, i);
                generatePerms(str, allPerms, start + 1);
                str = swap(str, start, i);
            }
        }
    }

    private static String swap(String str, int start, int i) {
        char[] chars = str.toCharArray();
        char lethalTempo = chars[start];
        chars[start] = chars[i];
        chars[i] = lethalTempo;
        return String.valueOf(chars);
    }


}
