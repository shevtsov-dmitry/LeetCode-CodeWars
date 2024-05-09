import java.util.HashSet;
import java.util.Set;

void main() {
//    Input: s = "leetcode"
//    Output: "leotcede"
//    String s = "leetcode";
    String s = "hello";
    reverseVowels(s);
}

public String reverseVowels(String s) {
    var sb = new StringBuilder(s);
    for (int l = 0, r = s.length() - 1; l <= r; ) {
        if (isVowel(s.charAt(l)) && isVowel(s.charAt(r))) {
            sb.setCharAt(l, s.charAt(r));
            sb.setCharAt(r, s.charAt(l));
            l++;
            r--;
        } else if (isVowel(s.charAt(r))) {
            l++;
        } else if (isVowel(s.charAt(l))) {
            r--;
        } else {
            l++;
            r--;
        }
    }
    return sb.toString();
}

boolean isVowel(char c) {
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
}