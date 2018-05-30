package com.test.beans;

public class Box<T> {

	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		Box<String> strBox = new Box<>();
		strBox.set("string");
		
		Box<Integer> intBox = new Box<>();
		intBox.set(1);
		
		System.out.println(strBox.get());
		System.out.println(intBox.get());
	}
	
}


