package com.cli.stackLinkedList;

public class StackLinkedList<T extends Comparable<T>> implements Stack<T>{
	//fast since all operations are O(1) running complexity
	//not memory efficient since references Node<T>
	private Node<T> root; 
	private int counter;
	//O(1) insert node at the beginning of linked list
	@Override
	public void push(T data) {
		this.counter++;
		if (this.root == null) {
			root = new Node<T> (data);
		} else {
			Node<T> node = new Node<T>(data);
			node.setNextNode(root);
			root = node;
		}
	}

	//O(1)
	@Override
	public T pop() {
		if (root == null) return null;
		this.counter--;
		T data = root.getData();
		root = root.getNextNode();
		return data;
	}
	//O(1)
	@Override
	public int size() {
		return this.counter;
	}
	//O(1)
	@Override
	public boolean isEmpty() {
		return this.root == null;
	}
}
