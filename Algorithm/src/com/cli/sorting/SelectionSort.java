package com.cli.sorting;

public class SelectionSort extends Utility{
	public static void main(String[] args) {
		int nums[] = {1, 56, 32, 34, 58, 2};
		for (int i = 0; i < nums.length -1; i++) {
			int index = i;
			for (int j = i+1; j < nums.length; j++){
				if (nums[j] < nums[index]) {
					index = j;
				}
			}
			if (index != i) {
				swap(nums, i, index);
			}
		}
		showArray(nums);
	}
}
