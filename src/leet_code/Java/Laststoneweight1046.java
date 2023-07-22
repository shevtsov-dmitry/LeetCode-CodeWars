package leet_code.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Laststoneweight1046 {

	public static void main(String[] args) {

		int[] numbers = {2,7,4,1,8,1};
		
		System.out.println(lastStoneWeight(numbers));
		System.out.println("fire started");
	}
	
	public static int lastStoneWeight(int[] stones) {
		
		int winner = 0;
		Arrays.sort(stones);
		ArrayList<Integer> cobblestones = new ArrayList<>(); 
		Arrays.stream(stones).forEach(cobblestones::add);
		
//		System.out.println(cobblestones); // before
		
//		int max1 = findMax(cobblestones);
//		cobblestones.removeIf(e -> e == max1);
//		int max2 = findMax(cobblestones);
//		cobblestones.removeIf(e -> e == max2);
//		
//		if(max1 != max2) {
//			winner = max1 - max2;
//			cobblestones.add(winner);
//		}
		
//		System.out.println(cobblestones); // after
//		while(!cobblestones.isEmpty()) {
//			// find max element
//			int max1 = findMax(cobblestones);
//			// delete the element before find other max one
//			cobblestones.removeIf(e -> e == max1);
//			// repeat the process to define second one
//			int max2 = findMax(cobblestones);
//			cobblestones.removeIf(e -> e == max2);
//			
//			// the logic of the game
//			if(max1 != max2) {
//				winner = max1 - max2;
//				cobblestones.add(winner);
//			} е
//			else {
//				cobblestones.removeIf(e -> e == 0);
//				winner = max1;
//				cobblestones.removeIf(e -> e == max1);
//			}
//			
//		}
		
		if(cobblestones.isEmpty()) return 0;
		return winner;
	}
	
	public static int findMax(ArrayList<Integer> list){
		int max = 0;
		for (int weight : list) {
			if (weight > max) max = weight;
		}
		return max;
	}
}
