package com.test;

public class PracticeBinarySearch {
	
	public static void main(String[] args) {
		System.out.println("code demo");
		
		//test - odd, even
		//test - in middle, in left, in right, out left, out right
		
		//test - odd middle
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 10;
		
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
//		int num  = 20;
		
		//test below range
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 1;
		
		//test above range
//		int[] array = {2,3,7,10,12,18,20};
//		int num  = 21;

		//test not in range
		int[] array = {2,3,7,10,12,18,20};
		int num  = 4;

		int match = binarySearch(array, 0, array.length-1, num);
		System.out.println("matchIndex=" + match);
	}
	
	public static int binarySearch(int[] array, int low, int high, int num) {//return index
		
		System.out.println("~~~~~~~~~~");
		System.out.println("low=" + low + " high=" + high + " num=" + num);
		
		int match = -1;
		if(low>high) {
			System.out.println("not in range");
			return -1;
		}
		
		//find mid index and num
		int mid = low + (high-low)/2;
		int midNum = array[mid];
		
		System.out.println("mid=" + mid + " midNum=" + midNum);
		
		//compare with num
		if(num==midNum) {//match middle
			System.out.println("mid match");
			return mid;
		}
		else if (num>midNum) {//search right
			System.out.println("search right");
			return binarySearch(array, mid+1, high, num);
		}
		else if (num<midNum) {//search left
			System.out.println("search left");
			return binarySearch(array, low, mid-1, num);
		}
		
		return match;
	}
	
}
