package com.cli.linkedlist;

public class testLinkedList<T extends Comparable<T>> implements List<T> {
	private Node<T> root;
	private int sizeCounter;

	@Override
	public void insert(T data) {
		this.sizeCounter++;
		Node<T> nextNode = new Node<T>(data);
		if (root == null) {
			this.root = nextNode;
		} else {
			insertDataBegning(data);

		}
	}

	private void insertDataBegning(T data) {
		Node<T> nextNode = new Node<T>(data);
		nextNode.setNextNode(root);
		this.root = nextNode;
	}

	@Override
	public void remove(T data) {
		if (root == null) {
			return;
		}
		this.sizeCounter--;
		if (this.root.getData().compareTo(data) == 0) {
			this.root = null;
		} else {
			remove(data, root, root.getNextNode());
		}

	}

	private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {
		while (actualNode != null) {
			if (actualNode.getData().compareTo(dataToRemove) == 0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();

		}
	}

	@Override
	public void traverseList() {
		if (this.root == null) {
			System.out.println("empty");
			return;
		} 
		Node<T> nextNode = this.root.getNextNode();
		System.out.println(root.getData());
		while (nextNode != null) {
			System.out.println(nextNode.getData());
			nextNode = nextNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return sizeCounter;
	}

}
