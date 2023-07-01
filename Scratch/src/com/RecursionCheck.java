package com;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class RecursionCheck {
	
	public static void main(String[] args) {
		int[] arr= new int[5];
		rec(0, arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rec(int i, int[] arr) {
		var r = new Random();
		arr[i] = r.nextInt(30);
		rec(i + 1, arr);
		System.out.println("FINISHED");
	}
	
}