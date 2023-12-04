package code_wars.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class IntervalOverlap {
    /*
   [1, 4],
   [7, 10],
   [3, 5]

   expect equals 7
   */
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals based on start points
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        System.out.println("intervals = " + Arrays.deepToString(intervals));
        // Step 2: Merge overlapping intervals
        LinkedList<int[]> mergedIntervals = new LinkedList<>();
        for (int[] interval : intervals) {
            if (mergedIntervals.isEmpty() || mergedIntervals.getLast()[1] < interval[0]) {
                // No overlap, add the interval to the result
                mergedIntervals.add(interval);
            } else {
                // Overlap, merge intervals
                mergedIntervals.getLast()[1] = Math.max(mergedIntervals.getLast()[1], interval[1]);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{7, 10}, {3, 5}, {1, 4}};
        int[][] mergedIntervals = mergeIntervals(intervals);

        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }


}

