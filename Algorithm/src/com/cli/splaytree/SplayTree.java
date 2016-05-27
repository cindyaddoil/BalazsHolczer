package com.cli.splaytree;

public class SplayTree<T extends Comparable<T>> {

	private int size;
	private Node<T> root;

	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insert(data, root);
		}
	}

	private void insert(T data, Node<T> node) {

		Node<T> tempNode = this.root;
		Node<T> parentNode = null;
		while (tempNode != null) {
			parentNode = tempNode;
			if (tempNode.getData().compareTo(data) < 0) {
				tempNode = tempNode.getRightChild();
			} else {
				tempNode = tempNode.getLeftChild();
			}
		}
		tempNode = new Node<T>(data);
		tempNode.setParentNode(parentNode);
		if (parentNode == null) {
			this.root = tempNode;
		} else if (parentNode.getData().compareTo(tempNode.getData()) < 0) {
			parentNode.setRightChild(tempNode);
		} else {
			parentNode.setLeftChild(tempNode);
		}
		splay(tempNode); // rotate the insertion node to root
		this.size++;
	}

	public void inOrderTraversal() {
		if (this.root != null) {
			this.root.inOrderTraversal();
		}
	}

	public T getMin() {
		if (this.root != null) {
			return this.root.getMin();
		}
		return null;
	}

	public void printRoot() {
		System.out.println(root);
	}

	public T getMax() {
		if (this.root != null) {
			return this.root.getMax();
		}
		return null;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public int size() {
		return size;
	}

	public Node<T> find(T data) {

		Node<T> tempNode = this.root;

		while (tempNode != null) {
			if (tempNode.getData().compareTo(data) < 0) {
				tempNode = tempNode.getRightChild();
			} else if (tempNode.getData().compareTo(data) > 0) {
				tempNode = tempNode.getLeftChild();
			} else {
				splay(tempNode);
				return tempNode;
			}
		}

		splay(tempNode);

		return null;

	}

	private void rotateLeft(Node<T> node) {

		Node<T> tempNode = node.getRightChild();

		if (tempNode != null) {

			node.setRightChild(tempNode.getLeftChild());

			if (tempNode.getLeftChild() != null) {
				tempNode.getLeftChild().setParentNode(node);
			}

			tempNode.setParentNode(node.getParentNode());
		}

		if (node.getParentNode() == null) {
			this.root = tempNode;
		} else if (node == node.getParentNode().getLeftChild()) {
			node.getParentNode().setLeftChild(tempNode);
		} else {
			node.getParentNode().setRightChild(tempNode);
		}

		if (tempNode != null) {
			tempNode.setLeftChild(node);
		}

		node.setParentNode(tempNode);
	}

	private void rotateRight(Node<T> node) {

		Node<T> tempNode = node.getLeftChild();

		if (tempNode != null) {
			node.setLeftChild(tempNode.getRightChild());

			if (tempNode.getRightChild() != null) {
				tempNode.getRightChild().setParentNode(node);
			}

			tempNode.setParentNode(node.getParentNode());
		}

		if (node.getParentNode() == null) {
			this.root = tempNode;
		} else if (node == node.getParentNode().getLeftChild()) {
			node.getParentNode().setLeftChild(tempNode);
		} else {
			node.getParentNode().setRightChild(tempNode);
		}

		if (tempNode != null) {
			tempNode.setRightChild(node);
		}

		node.setParentNode(tempNode);
	}

	private void splay(Node<T> node) {

		while (node.getParentNode() != null) {

			if (node.getParentNode().getParentNode() == null) {
				if (node.getParentNode().getLeftChild() == node) {
					rotateRight(node.getParentNode());
				} else {
					rotateLeft(node.getParentNode());
				}
			} else if (node.getParentNode().getLeftChild() == node
					&& node.getParentNode().getParentNode().getLeftChild() == node.getParentNode()) {
				rotateRight(node.getParentNode().getParentNode());
				rotateRight(node.getParentNode());
			} else if (node.getParentNode().getRightChild() == node
					&& node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
				rotateLeft(node.getParentNode().getParentNode());
				rotateLeft(node.getParentNode());
			} else if (node.getParentNode().getLeftChild() == node
					&& node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
				rotateRight(node.getParentNode());
				rotateLeft(node.getParentNode());
			} else {
				rotateLeft(node.getParentNode());
				rotateRight(node.getParentNode());
			}
		}
	}
}
