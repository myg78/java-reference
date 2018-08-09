package com.test.practice;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		fibonacciList();
	}
	
	private static void fibonacciList() {
		
		List<Integer> list = new ArrayList<>();
		int count = 10;
		
		for (int i = 0; i < count; i++) {
			if(list.size()>1) {
				list.add(getNext(list.get(list.size()-1), list.get(list.size()-2)));
			}
			else {
				list.add(1);
			}
		}
		
		list.forEach(System.out::println);
	}
	
	private static int getNext(int num1, int num2) {
		return num1 + num2;
	}
	
//	private static int fibonacciRecursive(int number) {
//		if(number == 1 || number == 2){ return 1;}
//
//		return fibonacciRecursive(number-1) + fibonacciRecursive(number-2);
//	}
	
}
