package com.test.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		
		Integer[] arr = {1,2,2,3,3,4,4,4,5};
		Integer[] arr2 = remove(arr);
		
		System.out.println("~~~~~~~~~");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
	
	private static Integer[] remove(Integer[] arr) {
		
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		//Integer[] arr2 = new Integer[set.size()];
		
		return set.stream().toArray(Integer[]::new);
//		return set.toArray(arr2);
	}
	
}
