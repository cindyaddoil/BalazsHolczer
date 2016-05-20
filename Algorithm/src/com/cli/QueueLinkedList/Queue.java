package com.cli.QueueLinkedList;

public interface Queue<T> {
	public void enQueue (T data);
	public T deQueue();
	public int size();
	public boolean isEmpty();

}
