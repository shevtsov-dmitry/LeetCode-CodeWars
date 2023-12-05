package code_wars.java;

import java.util.*;

public class IntervalOverlap {
    /*
   [1, 4],
   [7, 10],
   [3, 5]

   expect equals 7
   */
    public static int mergeIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(e -> e[0]));
        Deque<int[]> stack = new ArrayDeque<>();

        for (int[] interval : intervals) {
            if (!stack.isEmpty() && stack.peek()[1] >= interval[0]) {
                int[] popped = stack.pop();
                popped[1] = interval[1];
                stack.push(popped);
            } else {
                stack.push(interval);
            }
        }

        int sum = 0;
        for (int[] arr : stack) {
            sum += arr[1] - arr[0];
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] intervals = {{7, 10}, {3, 5}, {1, 4}};
        mergeIntervals(intervals);
    }


}

