package com.cli.hashtableChaining;

import java.util.Hashtable;

public class App {
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		hashTable.put(1, 23);
		hashTable.put(2, 26);
		hashTable.put(3, 222);
		hashTable.put(4, 200);
		hashTable.put(11, 25);
		System.out.println(hashTable.get(11));
	}
}
