package HashtableLinearProbing;

public class HashTable {

	private HashItem[] hashTable;
	
	public HashTable(){
		this.hashTable = new HashItem[Constants.TABLE_SIZE];
	}

	public int get(int key){
		
		int hash = key % Constants.TABLE_SIZE;
		
		while( this.hashTable[hash] != null && this.hashTable[hash].getKey() != key ){
			hash = ( hash+1 ) % Constants.TABLE_SIZE;
		}
		
		if( this.hashTable[hash] == null ){
			return -1;
		}else{
			return this.hashTable[hash].getValue();
		}	
	}
	
	public void put(int key, int value){
		
		int hash = key % Constants.TABLE_SIZE;
		
		while( this.hashTable[hash] != null && this.hashTable[hash].getKey() != key ){
			hash = (hash+1) % Constants.TABLE_SIZE;
		}
		
		this.hashTable[key] = new HashItem(key, value);	
	}
}
