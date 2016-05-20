package com.cli.stackArray;

public class App {
	public static void main(String[] args) {
		StackArray<String> stack = new StackArray<>();
		stack.push("Adam");
		stack.push("Joel");
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());		
	}
}
