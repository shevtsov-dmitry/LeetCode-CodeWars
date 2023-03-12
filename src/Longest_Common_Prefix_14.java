import java.util.Arrays;

public class Longest_Common_Prefix_14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));//"flower","flow","flight"
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < strs.length; i++) {
            while(j < strs[0].length() || j < strs[strs.length-1].length()) {
                if(strs[0].charAt(j) == strs[strs.length-1].charAt(j)) {
                    sb.append(strs[0].charAt(j));
                    j++;
                }
                else return sb.toString();
            }
        }
        return "";
    }
}
