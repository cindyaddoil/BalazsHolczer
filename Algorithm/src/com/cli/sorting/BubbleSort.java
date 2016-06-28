package com.cli.sorting;

public class BubbleSort  extends Utility{
	public static void main(String[] args) {
		int[] nums = {12, 7, -5, 102, -77};
		
		BogoSort.showArray(nums);
		System.out.println();
		for(int i = 0; i < nums.length -1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j+1]) {
					swap(nums, j, j+1);
				}
			}
		}
		showArray(nums);

	}
}
