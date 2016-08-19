package com.cli.Generics;

public class TypeErasure {
	public static <T> int count (T[] items, T pattern) {
		int counter = 0;
		for (T actualItem : items) {
			if (actualItem.equals(pattern)) {
				++counter;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		String[] names = {"Adam", "Kevin", "Adam"};
		String pattern = "Adam";
		System.out.println(count(names, pattern));
	}
}
