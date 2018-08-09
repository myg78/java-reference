package com.test.practice;

public class StringPalindrome {

	public static void main(String[] args) {
		isStringPalindrome("");
		isStringPalindrome("a");
		isStringPalindrome("ab");
		isStringPalindrome("aa");
		isStringPalindrome("abba");
		isStringPalindrome("abbc");
		isStringPalindrome("abcba");
		isStringPalindrome("abcbc");
	}
	
	private static boolean isStringPalindrome(String text) {
		
		//empty string
		if(text.isEmpty()) return true;
		boolean palindrome = checkRecursive(text, 0, text.length()-1);
		System.out.println("isStringPalindrome: " + text +  " " + palindrome);		
				
		return palindrome;
	}
	
	private static boolean checkRecursive(String text, int start, int end) {
		
		//System.out.println("index: " + start + " " + end);
		boolean match = text.charAt(start) == text.charAt(end);
		//System.out.println("match: " + match);
		
		if(!match) return false;
		
		if(start+1<end-1) {
			return checkRecursive(text, start+1, end-1);
		}
		else {
			return match;
		}
	}
	
}
