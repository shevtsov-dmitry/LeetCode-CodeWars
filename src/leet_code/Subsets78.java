package leet_code.java;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

	public static void main(String[] args) { subsets(new int[] { 1, 2, 3 });

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> variants = new ArrayList<>();
		List<Integer> sublist = new ArrayList<>();
		backtrackDfs(variants, sublist, nums, 0);
		return variants;
	}
	
	public static void backtrackDfs(List<List<Integer>> variants, 
			List<Integer> sublist,int[] nums, int index) {
		
		if(index >= nums.length) {
			variants.add(new ArrayList<>(sublist));
			return;
		}
		
		// decide to ADD
		sublist.add(nums[index]);
		backtrackDfs(variants, sublist, nums, index + 1);
		
		// decide to NOT ADD
		sublist.remove(sublist.size() - 1);
		backtrackDfs(variants, sublist, nums, index + 1);
		
	}
	
}
