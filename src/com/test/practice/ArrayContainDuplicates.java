package com.test.practice;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 */
public class ArrayContainDuplicates {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5,4,6};
		int[] arr = {1,2,3,4,5};
		
		boolean hasDuplicate = containsDuplicate2(arr);
		System.out.println("hasDuplicate: " + hasDuplicate);
	}
		
	public static boolean containsDuplicate(int[] nums) {
        
		boolean hasDuplicate = false;
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i: " + i + " : " + nums[i]);
			if(set.contains(nums[i])) {
				hasDuplicate = true;
				break;
			}
			else {
				set.add(nums[i]);
			}
		}
		
		return hasDuplicate;
    }
	
	public static boolean containsDuplicate2(int[] nums) {
        
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = set.add(nums[i]);
			System.out.println("i: " + i + " : " + nums[i] + " : " + add);
			if(!add) {
				return true;
			}
		}
		
		return false;
    }
	
}
