
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


void main() {
    List<Integer>[] twoDimArr = new List[2];
    twoDimArr[0] = new ArrayList<>(Arrays.asList(1, 2, 4));
    twoDimArr[1] = new ArrayList<>(Arrays.asList(3, 3, 1));
}

public int deleteGreatestValue(int[][] grid) {
    int sum = 0;
    List<List<Integer>> gridLists = new ArrayList<>();
    for (int[] row : grid) {
        List<Integer> rowList = new ArrayList<>();
        for (int col : row) {
            rowList.add(col);
        }
        gridLists.add(rowList);
    }

    List<Integer> maxIntsFromEachRow = new ArrayList<>();

    while (!gridLists.get(0).isEmpty()) {
        maxIntsFromEachRow.clear();
        for (List<Integer> array : gridLists) {
            int max = findMax(array);
            maxIntsFromEachRow.add(max);
            int maxIndex = 0;
            for (int i = 0; i < array.size(); i++) {
                if (max == array.get(i)) maxIndex = i;
            }
            array.remove(maxIndex);
        }
        sum += findMax(maxIntsFromEachRow);
    }

    return sum;
}

public int findMax(int[] array) {
    int max = 0;
    for (int weight : array) {
        if (weight > max) max = weight;
    }
    return max;
}

public int findMax(List<Integer> list) {
    int max = 0;
    for (int weight : list) {
        if (weight > max) max = weight;
    }
    return max;
}
	
