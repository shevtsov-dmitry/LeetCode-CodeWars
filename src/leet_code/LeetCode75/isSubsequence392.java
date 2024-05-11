import java.util.*;

void main() {
    isSubsequence("abc", "ahbgdc");
}

//Input: s = "abc", t = "ahbgdc"
//Output: true

public boolean isSubsequence(String s, String t) {
    if (s.length() > t.length() || s.isEmpty()) return false;
    int subsLen = 0;
    for (char tChar : t.toCharArray()) {
        if (s.charAt(subsLen) == tChar) {
            subsLen++;
        }
        if (subsLen == s.length()) {
            return true;
        }
    }
    return false;
}