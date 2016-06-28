package com.cli.sorting;

public class BogoSort extends Utility {
	public static void main(String[] args) {
		int [] nums = {1, 34, 0, -1};
		int loopCounter = 0;
		while(!isSorted(nums)){
			shuffle(nums);
			++loopCounter;
			System.out.println("loopcounter " + loopCounter);
			showArray(nums);
		}
	}
}
