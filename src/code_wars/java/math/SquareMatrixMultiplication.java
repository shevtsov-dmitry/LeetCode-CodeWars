package code_wars.java.math;

import java.util.Arrays;

public class SquareMatrixMultiplication {

    /* A         B          C
     |1 2|  x  |3 2|  =  | 5 4|
     |3 2|     |1 1|     |11 8|
    */
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 1},
                {0, 1, 0},
                {2, 3, 4}
        };
        int[][] arr2 = {
                {2, 5},
                {6, 7},
                {1, 8}
        };
        matrixMultiplication(arr1, arr2);
    }

    public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        // X length in @a always should be equals Y length in @b
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < b[0].length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < b.length; k++) {
                    sum += b[k][i] * a[j][k];
                }
                c[j][i] = sum;
            }
        }
        return c;
    }
}
























