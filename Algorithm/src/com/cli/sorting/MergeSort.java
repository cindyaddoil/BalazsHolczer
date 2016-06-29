package com.cli.sorting;

public class MergeSort extends Utility {
	private int[] nums;
	private int[] tempArray;
	public MergeSort(int[] nums) {
		this.nums = nums;
		tempArray = new int[nums.length];
	}
	public static void main(String[] args) {
		int[] nums = { 8, -3, 78, -1 };
		MergeSort mergeSort = new MergeSort(nums);
		mergeSort.mergeSort(0, nums.length - 1);
		showArray(nums);
	}
	private void mergeSort(int low, int high) {
		if (low >= high) return;
		int middle = (low + high)/2;
		//System.out.println(low + " " + middle);
		mergeSort(low, middle);
		mergeSort(middle+1, high);
		merge(low, middle, high);
	}
	private void merge(int low, int middle, int high) {
		//copy num[i] to tempArray
		for (int i = low; i <= high; i++) {
			tempArray[i] = nums[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		
		//copy the smallest values from either the left or the right side back to the original array
		while ((i <= middle) && (j<=high)) {
			if (tempArray[i] <= tempArray[j]) {
				nums[k] = tempArray[i];
				i++;
			} else {
				nums[k] = tempArray[j];
				j++;
			}
			k++;
		}
		
		//copy the rest of the left side of the array into the target array
		while(i <= middle) {
			nums[k] = tempArray[i];
			k++;
			i++;
		}
	}
	
}
