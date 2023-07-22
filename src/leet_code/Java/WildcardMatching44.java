package leet_code.Java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildcardMatching44 {
    /*
     *   '?' Matches any single character.
     *   '*' Matches any sequence of characters (including the empty sequence).
     */
    public static void main(String[] args) {
//        System.out.println(isMatch("aa","a"));
//        isMatch("cd","cd");
//        isMatch("cd","?d");
//        isMatch("cd","?a");
//        System.out.println(isMatch("vkdoAfewjiewfB","*A*B"));
        System.out.println(isMatch("adceb","*a*b"));
//        isMatch("abcScc","abc?cc");
    }
    public static boolean isMatch(String s, String p) {
        StringBuilder sb = new StringBuilder();
        // explicit exceptions
        if(p.equals("*")) return true;

        boolean isThereAster = false;
        for (int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == '*'){
                isThereAster = true;
                break;
            }
        }
        if(!isThereAster && s.length() != p.length()) return false;
        if(s.charAt(s.length() - 1) != '*' && p.charAt(p.length() - 1) == '*') return true;

        int rememberIndex = 0; // использую запоминать индекса для считывания всей строки, зашифрованной c помощью *
        for (int i = 0; i < p.length() - 1; i++) {
            // В случае если попадается * проверяем заканчивается ли последовательность на sequenceStopSign,
            // то есть на следующий символ патерна
            if(p.charAt(i) == '*'){
                char sequenceStopSign = p.charAt(i+1);
                while(s.charAt(rememberIndex) != sequenceStopSign){
                    rememberIndex++;
                }
                if(sequenceStopSign != s.charAt(rememberIndex))
                    return false;
                else {
                    sb.append("*");
                    rememberIndex++;
                }
//                System.out.println(i + "\t" + sequenceStopSign + "\t" + s.charAt(rememberIndex));
            }
            else if(p.charAt(i) == '?'){
                boolean wasAsterios = false;
                for (int j = 0; j < sb.length(); j++) {
                    if(sb.charAt(j) == '*'){
                        wasAsterios = true;
                        break;
                    }
                }
                // ab*bd?s  ---
                if(wasAsterios){ // ?????
                    sb.append("?");
                }
                else if(p.charAt(i) == '?') {
                    sb.append(s.charAt(i));
                    rememberIndex++; // ?????
                }
                else {
                    System.out.println("question mark absent");
                    return false;
                }
            }
            else {
                sb.append(s.charAt(rememberIndex));
                System.out.println("iteration: "+ rememberIndex+"  and i append: " + s.charAt(rememberIndex));
                rememberIndex++;
            }
        }
        sb.append(s.charAt(s.length()-1));
        System.out.println("sb: " + sb +"\t" + "p: " +p);
        return sb.toString().equals(p);
    }
    // solution from leet_code c++ and chatgpt parsing
    public static boolean isMatchingleet_code(String s, String p) {
        int pSize = p.length();
        int cSize = s.length();
        List<Boolean> arr = new ArrayList<>(Collections.nCopies(cSize + 1, false));
        List<Boolean> brr = new ArrayList<>(Collections.nCopies(cSize + 1, false));
        arr.set(0, true);
        boolean dn = true;

        for (int i = 1; i <= pSize; i++) {
            if (p.charAt(i - 1) != '*')
                dn = false;
            if (dn)
                brr.set(0, true);
            else
                brr.set(0, false);

            for (int j = 1; j <= cSize; j++) {
                if (p.charAt(i - 1) == '?') {
                    brr.set(j, arr.get(j - 1)); continue;
                }

                if (p.charAt(i - 1) == '*') {
                    brr.set(j, arr.get(j - 1) || arr.get(j) || brr.get(j - 1));
                    continue;
                }

                if (p.charAt(i - 1) == s.charAt(j - 1))
                    brr.set(j, arr.get(j - 1));
                else
                    brr.set(j, false);

            }

            arr = new ArrayList<>(brr);
        }
        return arr.get(cSize);
    }
}

