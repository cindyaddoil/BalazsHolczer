package com.cli.sorting;

public class InsertionSort  extends Utility{
	public static void main(String[] args) {
		int [] nums = {1, 56, 32, 34, -58, 2};
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while ((j>0) && (nums[j-1] > nums[j])) {
				swap(nums, j, j-1);
				--j;
			}
		}
		showArray(nums);
	}
}
