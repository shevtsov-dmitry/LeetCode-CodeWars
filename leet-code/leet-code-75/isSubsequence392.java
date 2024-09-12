void main() {
    String s = "abc", t = "ahbgdc";
    boolean subsequence = isSubsequence(s, t);
    System.out.println(subsequence);
}

public boolean isSubsequence(String s, String t) {
    if (s.isEmpty()) return true;
    int subSeqIdx = 0;
    for (char c : t.toCharArray()) {
        if (subSeqIdx >= s.length()){
            return true;
        }
        if (s.charAt(subSeqIdx) == c) {
            subSeqIdx++;
        }
    }
    return subSeqIdx >= s.length();
}