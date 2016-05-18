package com.cli.arrays;

public class App {
	public static void main(String[] args) {
		int[] nums = new int[10];
		nums[0] = 1;
		nums[3] = 23;
		for (int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		//O(1) good fast
		System.out.println("\n" + nums[3]);
		
		//we want to get the item with value 23
		//O(N) not good
		for (int i=0; i<nums.length; i++) {
			if(nums[i] == 23) {
				System.out.println(i);
				
			}
		}	
		
		//resize array 
		//O(N) --> arrays are not dynamic
		int[] nums2 = new int[20];
		for (int i=0; i<nums.length; i++) {
			nums2[i] = nums[i];
		}
	}
}
