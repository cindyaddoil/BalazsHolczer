package HashtableLinearProbing;

public class App {

	public static void main(String[] args) {
		
		HashTable hashTable = new HashTable();
		
		hashTable.put(1, 10);
		hashTable.put(2, 100);
		hashTable.put(3, 1000);
		
		System.out.println(hashTable.get(5));

	}

}
