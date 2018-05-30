package com.test;

import java.util.Arrays;

public class BinarySearch {

	public int binarySearch(int[] arr, int low, int high, int num) {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("low=" + low + " high="
				+ "" + high);
		int match = -1;//default not found
		
		//check if num in range
//		if(num>arr[high] || num<arr[low]) {
//			System.out.println("Not in range");
//			return -1;
//		}
		
		if(high<low) {
			return -1;
		}
		
		int mid = low + (high-low)/2;
		int midNum = arr[mid];
		System.out.println("mid=" + mid + " midNum=" + midNum + " num=" + num);
		
		if(midNum == num) {
			System.out.println("num in mid");
			match = mid;
			System.out.println("arr[" + mid +"]: " + num);
			return match;
		}
		else if (midNum > num) {
			System.out.println("num in left half");
			return binarySearch(arr, low, mid-1, num);
		} 
		else if (midNum < num) {
			System.out.println("num in right half");
			return binarySearch(arr, mid+1, high, num);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,7,10,20,40,45};//check odd even
		int num = 50;
		
		BinarySearch binarySearch = new BinarySearch();
		int match = binarySearch.binarySearch(arr, 0, arr.length-1, num);
		System.out.println("match: " + match);//default to -1 if not in range 
		System.out.println("Collections: " + Arrays.binarySearch(arr, num));//different implementation for numbers not in range
	}
	
}
