package com.test;

public class BubbleSort {

	public void sort(int[] arr) {
		
		int itr = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				itr++;
				System.out.println("i=" + i + " j=" + j + " itr=" + itr);
				System.out.println(arr[j] + " : " + arr[j+1]);
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public void printArray(int[] arr) {
		System.out.println("Print");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(arr);
		bubbleSort.printArray(arr);
	}
	
}
