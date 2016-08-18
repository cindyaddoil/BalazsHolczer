package com.cli.Generics;

// method overloading --> try to print string, double, integer with method for each
public class GenericMethods {
	//diamond parameter is before return type
	//specify T is going to class that extends Comparable interface. called bounded type parameters
	public static <T extends Comparable<T>> void printData(T data) {  
		System.out.println(data.toString());
	}
	public static void main(String[] args) {
		printData("hello");
	}
}
