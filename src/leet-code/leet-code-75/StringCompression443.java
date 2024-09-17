import java.util.HashMap;
import java.util.Map;

void main() {
//    Input: chars = ["a","a","b","b","c","c","c"]
//    Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//    Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    int compress = compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});

}

public int compress(char[] chars) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : chars) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    StringBuilder sb = new StringBuilder();
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        sb.append(entry.getKey()).append(entry.getValue());
    }
    for (int i = 0; i < sb.length(); i++) {
        chars[i] = sb.charAt(i);
    }
    return sb.length();
}