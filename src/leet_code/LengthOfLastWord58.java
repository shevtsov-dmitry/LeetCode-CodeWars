void main() {
    String s = "day";
    int i = lengthOfLastWord(s);
    System.out.println(i);
}

public int lengthOfLastWord(String s) {
    if (s.length() == 1 && Character.isAlphabetic(s.charAt(0))) {
        return 1;
    }

    char[] chars = s.toCharArray();
    int rememberLastWordIndex = Integer.MIN_VALUE;
    boolean foundLastIndex = false;
    for (int i = chars.length - 1; i >= 0; i--) {
        if (Character.isAlphabetic(chars[i]) && rememberLastWordIndex == Integer.MIN_VALUE) {
            rememberLastWordIndex = i;
            foundLastIndex = true;
        }
        if (rememberLastWordIndex == 0) {
            return 1;
        }
        if (i == 0 && Character.isAlphabetic(chars[i])) {
            return rememberLastWordIndex - i + 1;
        }
        if (foundLastIndex && !Character.isAlphabetic(chars[i])) {
            return rememberLastWordIndex - i;
        }

    }
    return 0;

}