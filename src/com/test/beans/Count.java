package com.test.beans;

public class Count {

	public static <T> int countInstance(T[] list, T item) {
		System.out.println(item);
		return 0;
	}
	
	public static void main(String[] args) {
		
		String[] list = new String[5];
		Count.countInstance(list, "a");
		
	}
	
}
