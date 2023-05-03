package scratches;

import java.util.ArrayList;
import java.util.Arrays;

public class Scratch {

	public static void main(String[] args) {
		int[] stones = {10, 5, 20, 15, 30};
		ArrayList<Integer> arr = new ArrayList<>();
		Arrays.stream(stones).forEach(arr::add);
		Arrays.sort(stones);
		int i = 0;
		while(!arr.isEmpty()) {
			int stone = stones[i];
			arr.removeIf(e -> e == stone);
			System.out.println(arr);
			i++;
		}
		
	}

}
