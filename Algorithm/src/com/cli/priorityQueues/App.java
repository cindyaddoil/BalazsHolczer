package com.cli.priorityQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {
	public static void main(String[] args) {
	/*	//primitive types
		Queue<Integer> pQueue = new PriorityQueue<>();
		pQueue.add(34);
		pQueue.add(56);
		pQueue.add(-3);
		pQueue.add(-123);
		System.out.println(pQueue.remove());
		System.out.println(pQueue.remove());
		System.out.println(pQueue.remove());
		System.out.println(pQueue.remove());*/
		Queue<Person> personQueue = new PriorityQueue<>();
		personQueue.add(new Person("Tom", 10));  //O(logN)
		personQueue.add(new Person("Mike", 12));
		personQueue.add(new Person("Jason", 20));
		System.out.println(personQueue.remove()); //O(logN)
		System.out.println(personQueue.remove());
		System.out.println(personQueue.remove());
	}
}
