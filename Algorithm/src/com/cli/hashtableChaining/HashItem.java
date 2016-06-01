package com.cli.hashtableChaining;

public class HashItem {
	private int key;
	private int value;
	private HashItem nexHashITem;
	public HashItem(int key, int value) {
		this.key = key;
		this.value = value;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public HashItem getNexHashITem() {
		return nexHashITem;
	}
	public void setNexHashITem(HashItem nexHashITem) {
		this.nexHashITem = nexHashITem;
	}
	
}
