package com.test.practice;

import com.test.util.PrintUtil;

public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] arr = {0,1,0,3,12};
		PrintUtil.printArrayLine(arr);
		
		moveZeroes(arr);
		PrintUtil.printArrayLine(arr);
	}

	public static void moveZeroes(int[] nums) {
        
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				
				int current = nums[j];
				if(current==0) {
					//swap
					if(j+1<nums.length) {
						int temp = nums[j];
						nums[j] = nums[j+1];
						nums[j+1] = temp;
					}
				}
			}
		}
    }
}
