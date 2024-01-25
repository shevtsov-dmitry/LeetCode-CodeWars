package leet_code.java;

import java.util.Arrays;

public class ValidAnagram242 {
  public static void main(String[] args) {

  }
  public static boolean isAnagram(String s, String t) {
      int mutualLength = 0;
      if(s.length() != t.length())
          return false;
      else
          mutualLength = s.length();
      char[] initial = s.toCharArray();
      char[] comparable = t.toCharArray();
      Arrays.sort(initial);
      Arrays.sort(comparable);

      for (int i = 0; i < mutualLength; i++) {
          if(initial[i] != comparable[i])
              return false;
      }
      return true;
  }

}
