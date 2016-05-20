package com.cli.binarySearchTree;

public class App {
	public static void main(String[] args) {
/*		Tree<Integer> tree = new BST<>();
		tree.insert(100);
		tree.insert(3);
		tree.insert(34);
		tree.insert(0);		
		tree.insert(-2);
		tree.traverseGraph();
		System.out.println(tree.getMin());
		tree.remove(34);
		tree.traverseGraph();*/


        Tree<Person> tree = new BST<>();
        
        tree.insert(new Person("Adam",34));
        tree.insert(new Person("Kevin",3));
        tree.insert(new Person("Joe",67));
        tree.insert(new Person("Mary",45));
       
        
        tree.traverseGraph();
        
	}
	
}
