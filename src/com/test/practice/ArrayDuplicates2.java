package com.test.practice;

import java.util.Arrays;

public class ArrayDuplicates2 {

	public static void main(String[] args) {
		
		int[] arr = {10,12,12,13,13,14};
		int[] arr2 = remove(arr);
		
		System.out.println("~~~~~~~~~");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	
	private static int[] remove(int[] arr) {
		
		if (arr.length < 2)
			return arr;
	 
		int j = 0;
		int i = 1;
	 
		while (i < arr.length) {
			
			System.out.println("i=" + i + " j= " + j);
			System.out.println("arr[i]=" + arr[i] + " arr[j]= " + arr[j]);
			
			if (arr[i] == arr[j]) {
				i++;
			} else {
				j++;
				arr[j] = arr[i];
				i++;
			}
		}
	 
		System.out.println("~~~~~~~~~");
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
		
		System.out.println("copy: " + j);
		int[] set = Arrays.copyOf(arr, j + 1);
	 
		return set;
	}
	
}
