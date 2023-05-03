package Leet_Code_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Delete_Greatest_Value_in_Each_Row_2500 {

	public static void main(String[] args) {
		List<Integer>[] twoDimArr = new List[2];
		twoDimArr[0] = new ArrayList<>(Arrays.asList(1, 2, 4));
		twoDimArr[1] = new ArrayList<>(Arrays.asList(3,3,1));
	}
	
	public static int deleteGreatestValue(int[][] grid) {
		int sum = 0;
		List<List<Integer>> gridLists = new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			gridLists.get(i).add(Arrays.asList(grid[i]));
			
		}
		
		
		List<Integer> maxIntsFromEachRow = new ArrayList<>();
		while(!gridList.isEmpty()) {
			for (int[] array : gridList) {
				maxIntsFromEachRow.clear();
				maxIntsFromEachRow.add(findMax(array));
				sum += findMax(maxIntsFromEachRow);
			}
		}
		
		return 0; 
	}
	
	public static int findMax(int[] array){
		int max = 0;
		for (int weight : array) {
			if (weight > max) max = weight;
		}
		return max;
	}
	public static int findMax(List<Integer> list){
		int max = 0;
		for (int weight : list) {
			if (weight > max) max = weight;
		}
		return max;
	}
	
}
