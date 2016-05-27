package com.cli.avl;

public class BalancedTree<T extends Comparable<T>> {

	private Node<T> root;

	public void insert(T newData) {

		Node<T> parentNode = this.root;

		if (this.root == null) {
			parentNode = this.root = new Node<>(newData, null);
		} else {
			parentNode = this.root.insert(newData, root);
		}

		rebalanceTree(parentNode);
	}
	
	public T getMin(){
		if( this.root != null ){
			return this.root.getMin();
		}else{
			return null;
		}
	}
	
	public T getMax(){
		if( this.root != null ){
			return this.root.getMax();
		}else{
			return null;
		}
	}
	
	public void traverseInOrder(){
		if( this.root != null ){
			this.root.traverse();
		}
	}
	
	public boolean remove(T newData) {
        if ( this.root == null )
              return false;
        else {
              if ( root.getData().compareTo(newData) == 0 ) {
                    Node<T> auxRoot = new Node<>(null,null);
                    auxRoot.setLeftChild(root);
                    boolean result = root.remove(newData, auxRoot);
                    root = auxRoot.getLeftChild();
                    return result;
              } else {
                    return root.remove(newData, null);
              }
        }
  }
	
	private void rebalanceTree(Node<T> parentNode) {

		setBalance(parentNode);

		if (parentNode.getBalance() < -1) {
			if (height(parentNode.getLeftChild().getLeftChild()) >= height(parentNode
					.getLeftChild().getRightChild())) {
				parentNode = rotateRight(parentNode);
			} else {
				parentNode = rotateLeftRight(parentNode);
			}
		} else if (parentNode.getBalance() > 1) {
			if (height(parentNode.getRightChild().getRightChild()) >= height(parentNode
					.getRightChild().getLeftChild()))
				parentNode = rotateLeft(parentNode);
			else
				parentNode = rotateRightLeft(parentNode);
		}

		if (parentNode.getParentNode() != null) {
			rebalanceTree(parentNode.getParentNode());
		} else {
			this.root = parentNode;
		}
	}

	private Node<T> rotateLeftRight(Node<T> node) {
		System.out.println("Rotation left rthen rigth");
		node.setLeftChild(rotateLeft(node.getLeftChild()));
		return rotateRight(node);
	}

	private Node<T> rotateRightLeft(Node<T> node) {
		System.out.println("Rotation right then left");
		node.setRightChild( rotateRight(node.getRightChild() ));
        return rotateLeft(node);	
	}

	private Node<T> rotateLeft(Node<T> node) {
		System.out.println("LEft rotation...");

		Node<T> b = node.getRightChild();
		b.setParentNode( node.getParentNode() );

		node.setRightChild(b.getLeftChild());

		if (node.getRightChild() != null)
			node.getRightChild().setParentNode(node);

		b.setLeftChild(node);
		node.setParentNode(b);

		if (b.getParentNode() != null) {
			if (b.getParentNode().getRightChild() == node) {
				b.getParentNode().setRightChild(b);
			} else {
				b.getParentNode().setLeftChild(b);
			}
		}

		setBalance(node);
		setBalance(b);

		return b;
	}

	private Node<T> rotateRight(Node<T> node) {
		System.out.println("Right rotation...");
		Node<T> b = node.getLeftChild();
		b.setParentNode(node.getParentNode());

		node.setLeftChild(b.getRightChild());

		if (node.getLeftChild() != null)
			node.getLeftChild().setParentNode(node);

		b.setRightChild(node);
		node.setParentNode(b);

		if (b.getParentNode() != null) {
			if (b.getParentNode().getRightChild() == node) {
				b.getParentNode().setRightChild(b);
			} else {
				b.getParentNode().setLeftChild(b);
			}
		}

		setBalance(node);
		setBalance(b);

		return b;
	}

	private void setBalance(Node<T> node) {
		node.setBalance( height(node.getRightChild() )- height(node.getLeftChild()));
	}

	private int height(Node<T> node) {

		if (node == null) {
			return -1;
		}

		return 1 + Math.max( height( node.getLeftChild()), height(node.getRightChild()) );
	}
}
