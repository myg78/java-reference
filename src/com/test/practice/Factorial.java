package com.test.practice;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("factorial: " + factorial(5));
		System.out.println("factorial2: " + factorial2(5));
	}
	
	private static int factorial(int num) {
		
		int factorial = 1;
		for (int i = num; i > 0; i--) {
			System.out.println(i);
			factorial = factorial*i;
		}
		return factorial;
	}
	
	private static int factorial2(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * factorial2(num-1);
	}
}
