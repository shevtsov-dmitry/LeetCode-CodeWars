package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoysAndGirlOnABrenchBacktracking {
    public static void main(String[] args) {
        String[] people = {"B1", "B2", "G"};
        List<String[]> feasibleVariants = new ArrayList<>();
        backtrack(people, feasibleVariants, 0, people.length - 1);
        for(String[] variant : feasibleVariants){
            System.out.println(Arrays.toString(variant));
        }
    }

    private static void backtrack(String[] people, List<String[]> feasibleVariants, int start, int end) {
            if(start == end && people[1] != "G"){
                feasibleVariants.add(people);
            } else {
                for (int i = start; i < people.length; i++) {
                    swap(people, start, i);
                    backtrack(Arrays.copyOf(people, people.length), feasibleVariants, start + 1, end);
                    swap(people, start, i);
                }
            }
    }

    private static void swap(String[] people, int idx1, int idx2) {
        String temp = people[idx1];
        people[idx1] = people[idx2];
        people[idx2] = temp;
    }

}