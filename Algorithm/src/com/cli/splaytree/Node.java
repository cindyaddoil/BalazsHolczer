package com.cli.splaytree;

public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	private Node<T> parentNode;
	public Node(T data){
		this.data = data;
	}
	public void inOrderTraversal(){
		if (this.leftChild != null) {
			this.leftChild.inOrderTraversal();
		}
		System.out.println(this.data + "-");
		if (this.rightChild != null) {
			this.rightChild.inOrderTraversal();
		}
	}
	public T getMin() {
		if (this.leftChild != null) {
			return this.leftChild.getMin();
		}
		return this.data;
	}
	public T getMax() {
		if (this.rightChild != null) {
			return this.rightChild.getMax();
		} else {
			return this.data;
		}
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
	public Node<T> getParentNode() {
		return parentNode;
	}
	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}
	@Override
	public String toString() {
		return this.data.toString();
	}
}
