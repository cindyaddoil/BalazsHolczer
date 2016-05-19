package com.cli.algorithm.linkedlist;

public class App {
	public static void main(String[] args) {
		List<String> myLinkedList = new LinkedList<String>();
		myLinkedList.insert("Mike");
		myLinkedList.insert("Tony");
		myLinkedList.insert("Joe");
		myLinkedList.insert("Jason");
		myLinkedList.remove("Joe");
		myLinkedList.traverseList();
	}
}
