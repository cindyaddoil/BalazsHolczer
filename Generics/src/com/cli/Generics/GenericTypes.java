package com.cli.Generics;
/*class Store {
 	// all the class have the parent class object -- not efficent -- need to casting
	private Object item; // each time we need to cast to Object which is expensive
	public void setItem (Object item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return this.item.toString();
	}
}
public class GenericTypes {
	public static void main(String[] args) {
		Store store = new Store();
		store.setItem("Hello world");
		System.out.println(45);
	}
}*/
class Store<T> {           //<> diamond operator which tell compiler Store class store unknown type objects 
	                       //<T> single generic item
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return this.item.toString();
	}
}
class Hashtalbe<K,V> { 
	private K key;
	private V value;
	public Hashtalbe (K key, V value) {           //multiple type parameters
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return this.key.toString() + "-" + this.value.toString(); 
	}
}
public class GenericTypes {
	public static void main(String[] args) {
		//raw type --> we should avoid raw type --> set type parameter
		//Store store = new Store();
		
		// specify type parameter, compiler no longer need to cast or object --> faster
		Store<Double> store = new Store<Double>();
		store.setItem(78.0);
		System.out.println(store);
		
		Hashtalbe<String, Integer> hashtable = new Hashtalbe <String, Integer>("Apple", 3);
		System.out.println(hashtable);
	}
}