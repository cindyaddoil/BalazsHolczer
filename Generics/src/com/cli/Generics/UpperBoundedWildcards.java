package com.cli.Generics;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcards {
	//Number: integer and double. upper bounded wild cards using extends notification
	public static double sum(List<? extends Number> list){
		double temp = 0;
		for(Number number: list) {
			temp = temp + number.doubleValue();
		}
		return temp;
	}
	public static void main(String[] args) {
		System.out.println(sum(Arrays.asList(1,2,3)));
		
	}
}
