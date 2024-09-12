void main() {
//    Input: s = "egg", t = "add"
//    Output: true
    String s = "egg", t = "add";
    boolean isomorphic = isIsomorphic(s, t);
//    System.out.println(isomorphic);
    s = "badc";
    t = "baba";
    boolean secCase = isIsomorphic(s, t);
    System.out.println(secCase);

}

public boolean isIsomorphic(String s, String t) {
    if (s.length() == 1) {
        return true;
    }
    int counterS = 0;
    int counterT = 0;
    for (int i = 0; i < s.length() - 1; i++) {
        if (s.charAt(i) != s.charAt(i + 1)) counterS++;
        if (t.charAt(i) != t.charAt(i + 1)) counterT++;
        if (counterT != counterS) {
            return false;
        }
    }

    if (s.charAt(s.length() - 1) != s.charAt(s.length() - 2) && t.charAt(t.length() - 1) == t.charAt(t.length() - 2))
        return false;
    if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2) && t.charAt(t.length() - 1) != t.charAt(t.length() - 2))
        return false;

    return true;
}