void main() {
    String s1 = "une", s2 = "deux";
    String answer = mergeAlternately(s1, s2);
    System.out.println(answer);
}

public String mergeAlternately(String s1, String s2) {
    StringBuilder sb = new StringBuilder();
    int maxLen = Math.max(s1.length(), s2.length());
    for (int i = 0; i < maxLen; i++) {
        if (i >= s1.length()) {
            sb.append(s2.charAt(i));
            continue;
        }
        if (i >= s2.length()) {
            sb.append(s1.charAt(i));
            continue;

        }
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
    }
    return sb.toString();
}