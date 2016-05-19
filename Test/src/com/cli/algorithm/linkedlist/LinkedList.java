package com.cli.algorithm.linkedlist;

import javax.swing.plaf.ActionMapUIResource;

public class LinkedList<T extends Comparable<T>> implements List<T> {
	private Node<T> root;
	int sizeCounter;

	@Override
	public void insert(T data) {
		++sizeCounter;
		if (this.root == null) {
			root = new Node<>(data);
		} else {
			insertDataBegining(data);
		}
	}

	private void insertDataBegining(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNextNode(root);
		this.root = newNode;
	}

	@Override
	public void remove(T data) {
		if (root == null)
			return;
		--sizeCounter;
		if (root.getData().compareTo(data) == 0) {
			this.root = root.getNextNode();
		} else {
			remove(data, root, root.getNextNode());
		}
	}

	private void remove(T data, Node<T> previousNode, Node<T> acutalNode) {
		while (acutalNode != null) {
			if (acutalNode.getData().compareTo(data) == 0) {
				previousNode.setNextNode(acutalNode.getNextNode());
				acutalNode = null;
				return;
			}
			previousNode = acutalNode;
			acutalNode = acutalNode.getNextNode();
			
		}
	}

	@Override
	public void traverseList() {
		Node<T> node = root;
		if (root == null)
			System.out.println("empty");
		while (node != null) {
			System.out.println(node);
			node = node.getNextNode();
		}
	}

	@Override
	public int size() {
		return sizeCounter;
	}

}
