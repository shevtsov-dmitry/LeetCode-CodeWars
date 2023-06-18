package Leet_Code_Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Combination_Sum_39 {

	public static void main(String[] args) {
		// Input: candidates = [2,3,5], target = 8
		// Output: [[2,2,2,2],[2,3,3],[3,5]]
		combinationSum(new int[] { 2, 3, 5 }, 8);
	}

	// UNFINISHED
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new LinkedList<>();
		backtrack(list, new ArrayList<>(), candidates, 0);
		Set<List<Integer>> noDups = new HashSet<>();
		list.removeIf(e -> e.stream().mapToInt(Integer::intValue).sum() != 8 || !noDups.add(e));
		return list;
	}

	private static void backtrack(List<List<Integer>> list, 
			ArrayList<Integer> subList, int[] candidates, int index) {
		int sum = 0;
		for (int i = index; i < candidates.length; i++) {
			subList.add(candidates[i]);
			sum = subList.stream().mapToInt(Integer::intValue).sum();
//			sum += candidates[i];
			if (sum <= 8) {
				backtrack(list, subList, candidates, i);
			}
			backtrack(list, subList, candidates, i + 1);
			subList.remove(subList.size() - 1);
			List<Integer> copyOfSubList = new ArrayList<>(subList);
			list.add(copyOfSubList);
//			int subListSum = subList.stream().mapToInt(Integer::intValue).sum();
//			if (subListSum == 8) list.add(subList);
//			System.out.printf("%2d ... %s%n",subListSum ,subList);
		}
	}
}
