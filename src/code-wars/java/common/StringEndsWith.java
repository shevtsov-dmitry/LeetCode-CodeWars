/*
* solution('abc', 'bc') // returns true
solution('abc', 'd') // returns false*/
void main() {
    solution("abc", "bc");
}

public boolean solution(String str, String ending) {
    if (str.isEmpty() || str.length() < ending.length())
        return false;

    int len = ending.length();
    char[] chars = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = chars.length - len; i < chars.length; i++) {
        sb.append(chars[i]);
    }
    return ending.contentEquals(sb);
}

