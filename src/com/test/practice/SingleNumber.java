package com.test.practice;

import java.util.TreeMap;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 */
public class SingleNumber {
	
	public static void main(String[] args) {
//		int[] nums = {3,3,1};
//		int[] nums = {4,1,2,1,2};
		int[] nums = {3,3,2,1,2};
		
		int num = singleNumber(nums);
		System.out.println(num);
	}
	
	public static int singleNumber(int[] nums) {
        
		TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for (int i = 0; i < nums.length; i++) {
//			System.out.println("~~~~~~~");
//			System.out.println("num: " + nums[i]);
			
			if(map.containsKey(nums[i])) {
				map.remove(nums[i]);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println("map: " + entry.getKey() + " " + entry.getValue());
//		}
		int num = map.firstEntry().getKey();
		
		return num;
    }
	
}
