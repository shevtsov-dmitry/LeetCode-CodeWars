package Leet_Code_Problems.Java;

import java.util.Arrays;

public class Rotate_Image_48 {
    public static void main(String[] args) {
        // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        // Output: [[7,4,1],[8,5,2],[9,6,3]]
        int[][] arr = new int[3][];
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{4,5,6};
        arr[2] = new int[]{7,8,9};


        System.out.println("Before rotation:");
        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));
        }
        rotate(arr);
        System.out.println("After rotate:");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
    public static void rotate(int[][] matrix) {

    }
}
