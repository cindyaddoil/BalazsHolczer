package SplayTree;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> rightNode;
	private Node<T> leftNode;
	private Node<T> parentNode;

	public Node(T data){
		this.data = data;
	}
	
	public void inOrderTraversal(){
		
		if( this.leftNode != null ){
			this.leftNode.inOrderTraversal();
		}
		
		System.out.print(this.data+" ");
		
		if( this.rightNode != null ){
			this.rightNode.inOrderTraversal();
		}
	}
	
	public T getMin() {	
		if( this.leftNode != null ){
			return this.leftNode.getMin();
		}else{
			return this.data;
		}
	}
	
	public T getMax(){
		if( this.rightNode != null ){
			return this.rightNode.getMax();
		}else{
			return this.data;
		}
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}

	public Node<T> getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
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
