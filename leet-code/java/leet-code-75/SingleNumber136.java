package leet_code.java;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SingleNumber136 {

	public  int singleNumber(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = new LinkedList<>();

		for (int val : arr) {
			if (set.contains(val)) {
				duplicates.add(val);
			}
			set.add(val);
		}

		for (int val : arr) {
			if (!duplicates.contains(val))
				return val;
		}

		return 0;
	}
	
	
	public  void main(String[] args) {

		int val = singleNumber(new int[] { 4, 1, 2, 1, 2 });
		System.out.println(val);

	}

}
