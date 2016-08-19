package com.cli.Generics;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
	public static void printList(List<?> list) {
		for (Object item: list) {
			System.out.print(item + " ");
		}
	}
	public static void main(String[] args) {
		printList(Arrays.asList('a', 'b', 'c'));
	}
}
