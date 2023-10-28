package code_wars.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SplitStrings {
    /*
     * * 'abc' =>  ['ab', 'c_']
     * 'abcdef' => ['ab', 'cd', 'ef']*/
    public static void main(String[] args) {
        solution("abcde");
    }

    public static String[] solution(String s) {
        if (s.isEmpty())
            return new String[0];
        //Write your code here
        Queue<Character> queue = new LinkedList<>();
        if (!(s.length() % 2 == 0)) {
            s += "_";
        }
        String[] result = new String[s.length()/2];
        for (int i = 0; i < s.length(); i++) {
            queue.offer(s.charAt(i));
        }
        for (int i = 0; !queue.isEmpty(); i++) {
            char ch1 = queue.poll();
            char ch2 = queue.poll();
            result[i] = String.valueOf(ch1) + String.valueOf(ch2);
        }

        System.out.println("result = " + Arrays.toString(result));
        return result;
    }
}
