package com.cli.sorting;

public class QuickSort extends Utility{
	private int[] nums;
	public QuickSort(int[] nums) {
		this.nums = nums;
	}

	public static void main(String[] args) {
		int [] nums = {8, -3, 78, -1};
		QuickSort quickSort = new QuickSort(nums);
		quickSort.sort(nums);
		quickSort.showArray(nums);
	}

	private void sort(int[] nums) {
		quickSort(0, nums.length - 1);
	}
	private int partition(int low, int high) {
		int pivotIndex = (low+high)/2;
		swap(nums, pivotIndex, high);
		int i = low;
		for (int j = low; j < high; j++) {
			if(nums[j]<= nums[high]) {
				swap(nums, i, j);
				i++;
			}
		}
		swap (nums, i, high);
		return i;
	}
	private void quickSort(int low, int high) {
		//base case
		if (low >= high) {
			return;
		}
		int pivotIndex = partition(low, high);
		quickSort(low, pivotIndex - 1);
		quickSort(pivotIndex + 1, high);
	}
}
