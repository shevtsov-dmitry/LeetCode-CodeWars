void main() {
    isPalindrome("A man, a plan, a canal: Panama");
}

public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    StringBuilder alphabeticOnly = new StringBuilder();
    for (char ch : s.toCharArray()) {
        if (Character.isAlphabetic(ch)) {
            alphabeticOnly.append(ch);
        }
    }
    if (alphabeticOnly.isEmpty()) return true;

    char[] letters = alphabeticOnly.toString().toCharArray();
    for (int i = 0, j = letters.length - 1; i < letters.length; i++, j--) {
        if(letters[i] != letters[j]) return false;
    }
    return true;
}
