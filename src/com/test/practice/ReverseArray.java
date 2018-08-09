package com.test.practice;

public class ReverseArray {

	public static void main(String[] args) {

//		String[] arr = null;
//		String[] arr = {};
//		String[] arr = {"Peter"};
//		String[] arr = {"Peter", "Tony"};
//		String[] arr = {"Peter", "Tony", "Bruce", "Natasha"};
		String[] arr = {"Peter", "Tony", "Bruce", "Natasha", "Wanda"};

		//print original
		printArray(arr);
		
		//revere array
		reverseArray(arr);
		
		//print reverse
		printArray(arr);
	}
	
	private static void reverseArray(String[] arr) {
		
		if(arr!=null && arr.length>1) {
			int mid = arr.length/2;
			
			for (int i = 0; i < mid; i++) {
				//System.out.println("i: " + i + " : " + arr[i]);
				String temp = arr[i];
				int high = arr.length-1-i;
				arr[i] = arr[high];
				arr[high] = temp;
			}
		}
	}
	
	private static void printArray(String[] arr) {
		System.out.println("~~~~~~~~~~~~~~~~~~");
		if(arr!=null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}
	
}
