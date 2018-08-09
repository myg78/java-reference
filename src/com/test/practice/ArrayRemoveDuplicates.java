package com.test.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,3,4,4,4,5};
		int size = remove(arr);
		System.out.println("size: " + size);
	}
	
	private static int remove(int[] arr) {
		
		//add to set
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		//Integer[] arr2 = new Integer[set.size()];
		//set.toArray(arr2);
		
		//convert back to array
		Integer[] arr2 = set.stream().toArray(Integer[]::new);
		printArray(arr2);
		
		return arr2.length;
	}
	
	
	private static void printArray(Integer[] arr) {
		System.out.println("~~~~~~~~~");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
