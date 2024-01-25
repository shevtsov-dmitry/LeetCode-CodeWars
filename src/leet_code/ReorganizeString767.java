package leet_code.java;

public class ReorganizeString767 {

    public static void main(String[] args) {
        String s = "aabaacc";
//        String s = "aaf";
        String newString = reorganizeString(s);
        System.out.println("new string = " + newString);
    }
    public static String reorganizeString(String s) {
        // fill hash
        int[] alphabetHash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabetHash[s.charAt(i) - 'a']++;
        }
        // find max letter occurred and its index
        int max = 0, letter=0;
        for (int i = 0; i < alphabetHash.length; i++) {
            int hash = alphabetHash[i];
            if(hash > max) {
                max = hash;
                letter = i;
            }
        }

        // return exception if can't replace
        if(max > (s.length() + 1) /2) return "";

        //fill result chars array with max occurred letter through one pass
        // like a _ a _ a _ _ _
        char[] res = new char[s.length()];
        int index = 0;
        while(max != 0){
            res[index] = (char) (letter + 'a');
            index +=2;
            alphabetHash[letter]--;
            max--;
        }

        // reorganize string
        for (int i = 0; i < alphabetHash.length; i++) {
            while(alphabetHash[i] > 0) {
                if(index >= res.length) index = 1;
                res[index] = (char) ('a' + i);
                index+=2;
                alphabetHash[i]--;
            }
        }

        return String.valueOf(res);
    }
}
// SOLUTION
