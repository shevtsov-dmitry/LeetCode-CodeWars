package leet_code.Java;

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


/*
    public static String reorganizeString(String S) {
        int[] hash = new int[26]; // english alphabet hash
        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i) - 'a']++; // count letters
        }

        int max = 0, letter = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        // if amount of maximal occurred letter in string is higher
        // than a half of string length, then it is not possible
        // to not repeat letter twice in a row.
        // And we need length +1 in case if length is odd.
        if (max > (S.length() + 1) / 2) {
            return "";
        }

        char[] res = new char[S.length()];
        int idx = 0;
        while (hash[letter] > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
            hash[letter]--;
        }
        for (int i = 0; i < hash.length; i++) {
            while (hash[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');
                idx += 2;
                hash[i]--;
            }
        }
        return String.valueOf(res);
    }
}
*/

/*  Nice solution! This is how I understand it:

  We construct the resulting string in sequence: at position 0, 2, 4, ... and then 1, 3, 5, ...
  In this way, we can make sure there is always a gap between the same characters

  Consider this example: "aaabbbcdd", we will construct the string in this way:

  a _ a _ a _ _ _ _ // fill in "a" at position 0, 2, 4
  a b a _ a _ b _ b // fill in "b" at position 6, 8, 1
  a b a c a _ b _ b // fill in "c" at position 3
  a b a c a d b d b // fill in "d" at position 5, 7
  */

/*    Great solution has illustrated how this solution works.
    Let me give more explanation.

            Firstly, the most-frequent char count > (S.size() + 1) / 2 then for sure we have to fail it.
    But why any strings with most-frequent char <= (S.size() + 1) / 2 MUST work?

    Take an example: for a length 7 string, suppose there are 4 x, and 3 other chars, then:
    x_x_x_x
    No matter what are other 3 chars are, it must work.

            if there are 3 x in this length 7 string, and the second-most-frequent char is y, then we know count of y has to be less than or equal to 3, and:
    x_x_x_y
    Here if we want to fail the string, we need to fill all empty slots with y, to make the last two slots are same.
            But this means count(y) = 4, so => contradiction.*/

