package com.test.practice;

public class StringPermutation {

	public static void main(String[] args) {
		permutation("123");
	}
	
	private static void permutation(String word) {
		permutation("", word);
	}
	
	private static void permutation(String left, String right) {
		
		System.out.println("~~~~~~~~~~");
		System.out.println("left: " + left + " right: " + right);
		
		if (right.isEmpty()) {
            System.out.println(left + right);

        } else {
        	
        	for (int i = 0; i < right.length(); i++) {
        		
//        		System.out.println(left + right);
//        		System.out.println("left: " + left + " right: " + right);
//        		System.out.println(left + right.charAt(i) + " : " + right.substring(0, i) + right.substring(i + 1, right.length()));

        		permutation(left + right.charAt(i), right.substring(0, i) + right.substring(i + 1, right.length()));
        	}
        }
	}
	
}
