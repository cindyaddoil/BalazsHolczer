package com.cli.binarySearchTree;
//Node itself don't need to compare. don't have to extends Comparable<T>
// We only compare the data of the node. just extends Comparable<T> at BST
public class Node<T> {
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}
	public Node<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
	

}
