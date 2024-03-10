void main() {
    String string = "A man, a plan, a canal: Panama";
    isPalindrome(string);
}
public boolean isPalindrome(String s) {
    if(s.isBlank()) return true;
    char[] charArray = s.toLowerCase().toCharArray();
    StringBuilder sb =new StringBuilder();
    for (char c : charArray) {
        boolean isLetterOrDigit = c >= 97 && c <= 122 || c >= 48 && c <= 57;
        if(isLetterOrDigit) {
            sb.append(c);
        }
    }

    String string = sb.toString();
    for (int i = 0, j = string.length() - 1; i < string.length() / 2; i++, j--) {
        if(string.charAt(i) != string.charAt(j)){
            return false;
        }
    }
    return true;
}