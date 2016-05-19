package com.cli.linkedlist;

public class App {
	public static void main(String[] args) {
/*		List<String> myLinkedList = new LinkedList<>();
		myLinkedList.insert("Daniel");
		myLinkedList.insert("Mike");
		myLinkedList.insert("Tracy");
		myLinkedList.insert("Joel");
		myLinkedList.insert("Adam");
		System.out.println(myLinkedList.size());
		myLinkedList.remove("Joel");
		System.out.println(myLinkedList.size());
		myLinkedList.traverseList();*/
		List<String> myLinkedList = new testLinkedList<>();
		myLinkedList.insert("Daniel");
		myLinkedList.insert("Mike");
		myLinkedList.insert("Tracy");
		myLinkedList.insert("Joel");
		myLinkedList.insert("Adam");
		System.out.println(myLinkedList.size());
		myLinkedList.remove("Joel");
		System.out.println(myLinkedList.size());
		myLinkedList.traverseList();
	}
}
