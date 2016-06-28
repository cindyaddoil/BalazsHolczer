package com.cli.sorting;

public class ShellSort extends Utility{
	int[] array;
	public ShellSort(int[] nums) {
		this.array = nums;
	}

	public static void main(String[] args) {
		int[] nums = {-4, -3, -2, -1, 0, 1, 2, 3, 4};
		ShellSort shellSort = new ShellSort(nums);
		shellSort.shellSort();
		showArray(nums);
	}

	private void shellSort() {
		//gap: 5, 2, 1
		for (int gap = array.length/2; gap > 0; gap /=2) {
			for (int i = gap; i < array.length; i++) {
				int val = array[i];
				int j = i;
				while ((j >= gap) && (array[j-gap] > val)) {
					array[j] = array[j-gap];
					j = j - gap;
				}
				System.out.println(gap + " " + i + " "  + j);
				array[j] = val;
			}
		}
	}
}
