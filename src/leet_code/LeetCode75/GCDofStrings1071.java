void main() {

}

private int gcd(int x, int y) {

    if (y == 0) {
        return x;
    }
    return gcd(y, x % y);
}

public String gcdOfStrings(String str1, String str2) {
    int max = Math.max(str1.length(), str2.length());
    int min = Math.min(str1.length(), str2.length());
    int len = gcd(max, min);
    if (!str1.concat(str2).equals(str2.concat(str1))) {
        return "";
    }
    return str1.substring(0, len);
}