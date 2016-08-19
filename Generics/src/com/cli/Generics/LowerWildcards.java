package com.cli.Generics;

import java.util.Arrays;
import java.util.List;

public class LowerWildcards {
	public static void addNumber(List<? super Integer> list) {
		for (Object i: list) {
			//list.add(i);
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		addNumber(Arrays.asList(1, 2, 3));
	}
}
