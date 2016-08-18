package com.cli.Generics;

import java.util.ArrayList;
import java.util.List;

class Bucket <T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}
public class TypeInference {
	public static <T> void addStore(T t, List<Bucket<T>> list) {
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString() + " has been added to the list...");
	}
	public static void main(String[] args) {
		List<Bucket<String>> list = new ArrayList<>();
		//type witness
		TypeInference.<String>addStore("Adam", list); 
		//if we don't use type witness .<String> , type inference algorithm will detect it's going to be String
		//TypeInference.addStore("Adam", list); 
		
	}
}
