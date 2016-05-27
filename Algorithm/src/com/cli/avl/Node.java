package com.cli.avl;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> leftChild;
	private Node<T> rightChild;
	private Node<T> parentNode;
	private int balance;
	
	public Node(T data, Node<T> parentNode){
		this.data = data;
		this.parentNode = parentNode;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public Node<T> insert(T newData, Node<T> parentNode){	
		
		if( newData.compareTo(this.data) < 0 ){
			if( this.leftChild == null ){
				this.leftChild = new Node<>(newData,parentNode);
			}else{
				this.leftChild.insert(newData, this);
			}
		}else{
			if( this.rightChild == null ){
				this.rightChild = new Node<>(newData,parentNode);
			}else{
				this.rightChild.insert(newData, this);
			}
		}
		
		return parentNode;
	}
	
	 public boolean remove(T value, Node<T> parent) {
         if (value.compareTo(this.data) < 0 ) {
               if ( this.leftChild != null )
                     return this.leftChild.remove(value, this);
               else
                     return false;
         } else if ( value.compareTo(this.data) > 0 ) {
               if ( this.rightChild != null )
                     return this.rightChild.remove(value, this);
               else
                     return false;
         } else {
               if ( this.leftChild != null && this.rightChild != null) {
                     this.data = this.rightChild.minValue();
                     this.rightChild.remove(this.data, this);
               } else if (parent.getLeftChild() == this) {
                     parent.setLeftChild( ( this.leftChild != null) ? leftChild : rightChild );
               } else if (parent.getRightChild() == this) {
                     parent.setRightChild( (this.leftChild != null) ? leftChild : rightChild );
               }
               return true;
         }
   }

   public T minValue() {
         if (this.leftChild == null)
               return this.data;
         else
               return this.leftChild.minValue();
   }
	
	public void traverse() {
		if( this.leftChild != null ){
			this.leftChild.traverse();
		}
		
		System.out.print(this+"-");
		
		if( this.rightChild != null ){
			this.rightChild.traverse();
		}
	}
	
	public T getMin() {
		if( this.leftChild == null ){
			return this.data;
		}else{
			return this.leftChild.getMin();
		}
	}
	
	public T getMax() {
		if( this.rightChild == null ){
			return this.data;
		}else{
			return this.rightChild.getMax();
		}
	}
	
	// geters and setters !!! ---------------------------------------------------------------

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

	public int getBalance() {
		return balance;
	}
	
	public T getData(){
		return this.data;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
