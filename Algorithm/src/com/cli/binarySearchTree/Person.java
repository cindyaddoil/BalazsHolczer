package com.cli.binarySearchTree;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person person) {
		return person.getName().compareTo(this.name);
		//return Integer.compare(person.getAge(), this.age);
	}
	
	@Override
	public String toString() {
		return name;
	}
}