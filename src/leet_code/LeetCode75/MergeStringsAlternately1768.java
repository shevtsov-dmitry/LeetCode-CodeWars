import java.util.Objects;

void main() {
//    Input: word1 = "abc", word2 = "pqr"
//    Output: "apbqcr"
//    Explanation: The merged string will be merged as so:
//    word1:  a   b   c
//    word2:    p   q   r
//    merged: a p b q c r
//    String s = mergeAlternately("abc", "pqr");
    String s = mergeAlternately("ab", "pqrc");
    if (!Objects.equals(s, "apbqcr")) {
        System.out.println(STR."ERROR: \{s}");
    }
    System.out.println(s);
}

public String mergeAlternately(String word1, String word2) {
    int min, max;
    boolean firstWordIsLonger = false;
    if (word1.length() < word2.length()) {
        min = word1.length();
        max = word2.length();
    } else {
        firstWordIsLonger = true;
        min = word2.length();
        max = word1.length();
    }
    var sb = new StringBuilder(word1.length() + word2.length());
    for (int i = 0; i < min; i++) {
        sb.append(word1.charAt(i)).append(word2.charAt(i));
    }
    for (int i = min; i < max; i++) {
        if (firstWordIsLonger) {
            sb.append(word1.charAt(i));
        } else {
            sb.append(word2.charAt(i));
        }
    }
    return sb.toString();
 }
