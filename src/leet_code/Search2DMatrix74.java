import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

void main() {
    int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
    };
    boolean b = searchMatrix(matrix, 3);
    System.out.println(b);
}

    public boolean searchMatrix(int[][] matrix, int target) {
    int[] array = new int[0];
        for (int i = 0; i < matrix.length - 1; i++) {
            if(target >= matrix[i][0] && target <= matrix[i + 1][0]) {
                array = matrix[i];
            }
        }

        int l = 0, r = array.length - 1, mid = -1;
        while (l<=r) {
            mid = l + (r-l) / 2;
            if(array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return false;
    }