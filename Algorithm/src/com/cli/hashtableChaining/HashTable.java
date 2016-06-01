package com.cli.hashtableChaining;

public class HashTable {
	private HashItem[] hashTable;
	public HashTable() {
		this.hashTable = new HashItem[Constants.TABLE_SIZE];
	}
	public int get(int key) {
		int hash = key % Constants.TABLE_SIZE;
		if (this.hashTable[hash] == null) {
			return -1;
		} else {
			HashItem hashItem = this.hashTable[hash];
			while(hashItem != null && hashItem.getKey() != key) {
				hashItem = hashItem.getNexHashITem();
			}
			if (hashItem == null) {
				return -1;
			} else {
				return hashItem.getValue();
			}
		}
	}
	public void put (int key, int value) {
		int hash = key % Constants.TABLE_SIZE;
		if (this.hashTable[hash] == null) {
			this.hashTable [hash] = new HashItem(key, value);
			
		}else{
			HashItem hashItem = this.hashTable[hash];
			while(hashItem.getNexHashITem() != null && hashItem.getKey() == key) {
				hashItem = hashItem.getNexHashITem();
			}
			if (hashItem.getKey() == key) {
				hashItem.setValue(value);
			}else {
				hashItem.setNexHashITem(new HashItem(key, value));
			}
			
		}
	}
}
