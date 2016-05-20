package com.cli.stackArray;
//Java doesn’t support generic array
//not so fast as stackLinkedlist implementation. but array is memory efficient
public class StackArray<Item> {
	private Item[] stack;
	private int numberOfItems;
	public StackArray() {
		this.stack = (Item[])new Object[1];
	}
	public void push(Item item) {
		if(numberOfItems == this.stack.length) {
			resize(2*this.stack.length);
		}
		this.stack[numberOfItems++] = item;
	}
	
	public Item pop() {
		Item itemToPop = this.stack[--numberOfItems];
		if( numberOfItems > 0 && numberOfItems == this.stack.length/4) {
			resize(this.stack.length/2);
		}
		return itemToPop;
	}
	
	public int size() {
		return this.numberOfItems;
	}

	public boolean isEmpty() {
		return this.numberOfItems == 0;
	}
	// O(N) 
	private void resize(int capacity) {
		Item[] stackCopy = (Item[])new Object[capacity];
		for(int i=0; i<numberOfItems; i++) {
			stackCopy[i] = this.stack[i];
 		}
		this.stack = stackCopy;
	}
}
