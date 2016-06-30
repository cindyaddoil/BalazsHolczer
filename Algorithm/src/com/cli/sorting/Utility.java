package com.cli.sorting;

public class Utility {

	public static void shuffle(int[] nums) {
		for (int i = nums.length - 1; i >= 0 ; --i) {
			int j = (int) (Math.random()*i);
			swap(nums, i, j);
		}
	}

	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static boolean isSorted(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i + 1] < nums[i]) {
				return false;
			}
		}
		return true;
	}

	public static void showArray(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public Utility() {
		super();
	}

}