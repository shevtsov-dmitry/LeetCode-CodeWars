package code_wars.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        rowSumOddNumbers(1);
    }
    public static int rowSumOddNumbers(int n) {
        List<List<Integer>> pyramid = new ArrayList<>();
        int oddNum = 1;
        int currentHeight = 1;

        pyramid.add(new ArrayList<>(Arrays.asList(oddNum)));
        while(currentHeight <= n){
            currentHeight++;
            List<Integer> currentPyramidLevel = new ArrayList<>();
            for (int i = 0; i < currentHeight; i++) {
                oddNum += 2;
                currentPyramidLevel.add(oddNum);
            }
            pyramid.add(currentPyramidLevel);
        }
        Optional<Integer> a = pyramid.get(n - 1).stream().reduce(Integer::sum);
        return (int) a.get();

    }


}
