package com.cli.QueueLinkedList;

// double linked list
// fast since O(1) operations but not memory efficient
public class QueueLinkedList<T extends Comparable<T>> implements Queue<T> {
	private Node<T> firstNode;
	private Node<T> lastNode;
	private int count;
	//O(1)
	@Override
	public void enQueue(T data) {
		this.count++;
		Node<T> oldLastNode = lastNode;
		this.lastNode = new Node<T>(data);
		this.lastNode.setNextNode(null);
		if (isEmpty()) {
			this.firstNode = this.lastNode;
		} else {

			oldLastNode.setNextNode(this.lastNode);
		}

	}
	//O(1)
	@Override
	public T deQueue() {
		this.count--;
		T data = this.firstNode.getData();
		this.firstNode = firstNode.getNextNode();
		if( isEmpty()) {
			this.lastNode = null;
		}
		return data;
	}

	@Override
	public int size() {
		return this.count;
	}

	@Override
	public boolean isEmpty() {
		return this.firstNode == null;

	}

}
