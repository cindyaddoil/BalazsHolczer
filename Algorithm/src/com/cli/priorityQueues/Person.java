package com.cli.priorityQueues;

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

	//return +1, if age is greater
	//0 
	//-1, age is smaller than the age of person
	@Override
	public int compareTo(Person person) {
		//return Integer.compare(this.age, person.getAge()); //age comparison
		//return this.name.compareTo(person.getName());	//name comparison in alphabetic order
		return -this.name.compareTo(person.getName());	//name comparison in reverse order
		
	}
	@Override
	public String toString() {
		return this.name + "-" + age;
	}
	
}
