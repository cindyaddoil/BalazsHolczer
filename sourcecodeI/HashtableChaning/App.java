package HashtableChaning;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable();
		
		hashTable.put(1, 23);
		hashTable.put(2, 26);
		hashTable.put(3, 222);
		hashTable.put(4, 200);
		
		System.out.println(hashTable.get(3));

	}
}
