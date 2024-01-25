package leet_code.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class NumberofStudentsUnabletoEatLunch1700 {
    /*
    * Constraints:
    1 <= students.length, sandwiches.length <= 100
    students.length == sandwiches.length
    * circular = 0
    * squared = 1
    sandwiches[i] is 0 or 1.
    students[i] is 0 or 1. */

    public static void main(String[] args) {
//        Input: students = [1,1,1,0,0,1], sandwiches = [1,0,0,0,1,1]
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        // TODO solve
        return 0;
    }

}
