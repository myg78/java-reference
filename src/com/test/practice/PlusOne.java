package com.test.practice;

/*
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 */
public class PlusOne {

	public static void main(String[] args) {
		
		int[] arr = {1,9};
		printArray(arr);
		
		int[] arr2 = plusOne(arr);
		printArray(arr2);
	}
	
	private static int[] plusOne(int[] digits) {
        
		//convert arr to int
		String str = "";
		for (int i = 0; i < digits.length; i++) {
			str += digits[i];
		}
		
		//plus 1 to int
		int num = 1 + Integer.valueOf(str);
		int[] plus = String.valueOf(num).chars().map(Character::getNumericValue).toArray();
		
		//convert int to char array to int array
//		char[] chars = String.valueOf(num).toCharArray();
//		int[] plus = new int[chars.length];
//		for (int i = 0; i < chars.length; i++) {
//			plus[i] = Character.getNumericValue(chars[i]);
//		}
		
		return plus;
    }
	
	private static void printArray(int[] arr) {
		System.out.println("~~~~~~~~~");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
