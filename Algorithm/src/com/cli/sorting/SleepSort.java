package com.cli.sorting;

import java.util.concurrent.CountDownLatch;

public class SleepSort {
	public static void main(String[] args) {
		int[] nums = { 1, 4, 2, 5, 6, 7, 3, 8, 43 };
		sleepSortAndPrint(nums);
	}

	private static void sleepSortAndPrint(int[] nums) {
		final CountDownLatch latch = new CountDownLatch(nums.length);
		for (final int num : nums) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					latch.countDown();
					try {
						latch.await();
						Thread.sleep(num*100);
						System.out.print(num + " ");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}).start();
		}
	}
	
}
