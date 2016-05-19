package com.cli.stackLinkedList;

public class App {
	public static void main(String[] args) {
		Stack<Integer> stack = new StackLinkedList<Integer>();
		stack.push(10);
		stack.push(3);
		stack.push(100);
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
	}
}
