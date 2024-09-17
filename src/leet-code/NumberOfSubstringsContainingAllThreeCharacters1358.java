//    Input: s = "abcabc"

//    Output: 10
//    Explanation: The substrings containing at least one occurrence of the characters a, b and c are
//    "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).
public void main(String[] args) {
    String string = "abcabc";
    numberOfString(string);
}

public int numberOfString(String s) {
    int countString = 0;
    for (int i = 0; i < s.length(); i++) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(i));
        for (int j = 0; j < s.length(); j++) {
            if (i == j) continue;

        }
    }

    return countString;

}
