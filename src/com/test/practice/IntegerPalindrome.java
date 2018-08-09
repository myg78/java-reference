package com.test.practice;

public class IntegerPalindrome {

	public static void main(String[] args) {
		
//		isPalindrome(-1);
//		isPalindrome(0);
//		isPalindrome(50);
//		isPalindrome(51);
//		isPalindrome(55);
//		isPalindrome(600);
		isPalindrome(6246);
//		isPalindrome(610);
//		isPalindrome(777);
	}
	
	private static boolean isPalindrome(int number) {
		
		boolean isPalindrome = false;
		
		System.out.println("isPalindrome: " + number + " " + isPalindrome);
		
		int palindrome = number;
		int reverse = 0;
		
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			System.out.println("remainder: " + remainder);
			
			reverse = reverse * 10 + remainder;
			System.out.println("reverse: " + reverse);
			
			palindrome = palindrome / 10;
			System.out.println("palindrome: " + palindrome);
		}
		
		return isPalindrome;
	}
	
}
