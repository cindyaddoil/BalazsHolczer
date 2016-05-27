package com.cli.splaytree;

public class App {

	
	
	public static void main(String[] args) {
		
		SplayTree<Integer> splayTree = new SplayTree<>();
		
		splayTree.insert(10);
		splayTree.insert(0);
		splayTree.insert(234);
		splayTree.insert(-3);
		
		splayTree.find(234);
		//splayTree.find(0);
		
		splayTree.printRoot();
		
	}
}
