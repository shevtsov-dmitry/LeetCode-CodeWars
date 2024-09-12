import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//    mat = [[3,1,6],[-9,5,7]]

//    in the same row or column

//    strictly greater

void main() {
    int[][] mat = {{3, 0, 6}, {-9, 5, 0}, {1, 4, 0}};
    int ocurs = maxIncreasingCells(mat);
//        System.out.println(ocurs);
}

/*
Sort pairs [i, j] by value of M[i][j],
and then iterate cells in increasing order.

For each M[i][j],
find out the current maximum steps in the same row and col,
dp[i][j] = max(max steps in row, max steps in col) + 1.

To make this process efficient,
we use res[i] to record the maximum step for row i,
we use res[m + j] to record the maximum step for col j.

Repeat this process until we find the steps for all cells,
return the maximum one.
*/
public int maxIncreasingCells(int[][] M) {
    int rows = M.length, cols = M[0].length;
    Map<Integer, List<int[]>> map = new TreeMap<>();
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            int val = M[i][j];
            if (!map.containsKey(val)) {
                map.put(val, new ArrayList<int[]>());
            }
            map.get(val).add(new int[]{i, j});
        }
    }
    int[][] dp = new int[rows][cols];
    int[] res = new int[cols + rows];
    for (int num : map.keySet()) {
        for (int[] pos : map.get(num)) {
            int i = pos[0], j = pos[1];
            dp[i][j] = Math.max(res[i], res[rows + j]) + 1;
        }
        for (int[] pos : map.get(num)) {
            int i = pos[0], j = pos[1];
            res[rows + j] = Math.max(res[rows + j], dp[i][j]);
            res[i] = Math.max(res[i], dp[i][j]);
        }
    }
    int ans = 0;
    for (int a : res)
        ans = Math.max(ans, a);
    return ans;
}
