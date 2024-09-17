import java.util.HashMap;
import java.util.Map;

//    Input: s1 = "ab", s2 = "eidbaooo"

public void main(String[] args) {
    String s1 = "abd", s2 = "eidbaooo";
    boolean b = checkInclusion(s1, s2);
    System.out.println("b = " + b);
}

public boolean checkInclusion(String s1, String s2) {
    if (s1.length() > s2.length())
        return false;
    Map<Character, Integer> s1map = new HashMap<>();

    for (int i = 0; i < s1.length(); i++)
        s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
    System.out.println("s1map = " + s1map);
    for (int i = 0; i <= s2.length() - s1.length(); i++) {
        Map<Character, Integer> s2map = new HashMap<>();
        for (int j = 0; j < s1.length(); j++)
            s2map.put(s2.charAt(i + j), s2map.getOrDefault(s2.charAt(i + j), 0) + 1);
        if (matches(s1map, s2map))
            return true;
        System.out.println("s2map = " + s2map);
    }
    return false;
}

public boolean matches(Map<Character, Integer> s1map, Map<Character, Integer> s2map) {
    for (char key : s1map.keySet())
        if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
            return false;
    return true;
}
