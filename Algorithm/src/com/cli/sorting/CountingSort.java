package com.cli.sorting;

public class CountingSort extends Utility {
	private int[] nums;
	public CountingSort(int[] nums) {
		this.nums = nums;
	}
	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 5, 6, 7, 4, 5, 6, 7, 3, 2, 5, 6, 7, 4, 5};
		CountingSort countingSort = new CountingSort(nums);
		countingSort.countingSort(2, 7);
		showArray(nums);
	}
	private void countingSort(int min, int max) {
		//allocate memory for the counter array O(k) memory complexity
		int[] count = new int[max - min + 1];
		System.out.println("k " + (max-min + 1));
		// O(N) consider all items in the original array
		for (int number : this.nums) {
			count[number - min]++;
		}
		showArray(nums);
		showArray(count);
		int z = 0;

		// count the occurrences in O(k) time
		for (int i = min; i <= max; i++) {
			while (count[i - min] > 0) {
				this.nums[z] = i;
				z++;
				count[i - min]--;
			}
			System.out.println("z " + z);
		}
	}

}
