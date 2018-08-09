package com.test.practice;

public class BinarySearch2 {
	
	public static void main(String[] args) {
		
		//test - odd, even
		//test - in middle, in left, in right, out left, out right
		
		//test - odd middle
		int[] array = {2,3,7,10,12,18,20};
		int num  = 10;
		
		//test - odd right
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 18;
		
		//test - odd left
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 3;
		
		//test - even left
//		int[] array = {2,3,7,10,12,18};
//		int num  = 7;
		
		//test - even right
//		int[] array = {2,3,7,10,12,18};
//		int num  = 12;
		
		//test below range
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 1;
		
		//test above range
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 21;

		//test not in range
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 4;

		int match = binarySearch(array, 0, array.length-1, num);
		System.out.println("matchIndex=" + match);
	}
	
	
	private static int binarySearch(int[] array, int low, int high, int num) {
		
		//find middle element
		int mid = low + (high-low)/2;
		//System.out.println("mid: " + mid);
		
		int match = -1;
		if(low>high) {
			System.out.println("Not in range");
			return match;
		}
		
		if(num == array[mid]) {
			return mid;
		}
		else if(num > array[mid]) {//search right
			return binarySearch(array, mid+1, high, num);
		}
		else if(num < array[mid]) {//search left
			return binarySearch(array, low, mid-1, num);
		}
		
		return match;
	}
	
}
