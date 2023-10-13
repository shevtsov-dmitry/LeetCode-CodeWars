package leet_code.java;

import java.util.LinkedList;
import java.util.List;

public class SolvingQuestionsWithBrainpower2140 {

	public static void main(String[] args) {
		//  [[1,1],[2,2],[3,3],[4,4],[5,5]]
		
		// 		[[3,2],[4,3],[4,4],[2,5]]
		int[][] myArr = new int[5][2];
		myArr[0] = new int[] {1,1};
		myArr[1] = new int[] {2,2};
		myArr[2] = new int[] {3,3};
		myArr[3] = new int[] {4,4};
		myArr[4] = new int[] {5,5};
		
		mostPoints(myArr);
	}
	
	public static long mostPoints(int[][] questions) {
        int max = 0;
        List<Integer> valuesFromLoop = new LinkedList<>();
        for (int i = 0; i < questions.length; i++) {
        	int[] task = questions[i];
			int points = task[0];
			int brainpowerPenalty = task[1];

			valuesFromLoop.add(points);
			for (int j = i; j < questions.length; j++) {
				if(brainpowerPenalty != 0) {
					brainpowerPenalty--;
				}
				else {
					System.out.println("iteration: %s".formatted(i) +"\t" + "j: %s".formatted(j));
					valuesFromLoop.add(questions[j][0]);
					brainpowerPenalty = questions[j][1];
				}
				int sumFromThisLoop = valuesFromLoop.stream().mapToInt(Integer::intValue).sum();
				if(sumFromThisLoop > max) max = sumFromThisLoop;
				valuesFromLoop.clear();
			}
        }
		
        return max;
    }
	
}
