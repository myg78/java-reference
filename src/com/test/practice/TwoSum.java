package com.test.practice;

public class TwoSum {

	public static void main(String[] args) {
		
//		int[] nums = {};
//		int[] nums = null;
//		int[] nums = {2,7,11,15};
		int[] nums = {7,11,15};
		
		int target = 9 ;
		
		int[] indices = twoSum(nums, target);
		
		if(indices!=null) {
			for (int i = 0; i < indices.length; i++) {
				System.out.println("indices: " + indices[i] + " = " + nums[indices[i]]);
			}
		}
		else {
			System.out.println("No two sum");
		}
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
        
		int[] indices = null;
		
		if(nums!=null) {
			for (int i = 0; i < nums.length; i++) {
				int c1 =  nums[i];
				
				System.out.println("~~~~~~~~~~");
				System.out.println("c1: " + i + " : " + c1);
				
				for (int j = i+1; j < nums.length; j++) {
					
					int c2 = nums[j];
					System.out.println("c2: " + j + " : " + c2);
					
					if(target == (c1+c2)) {
						System.out.println("match");
						indices = new int[] {i, j};
						break;
					}
				}
			}
		}
		
		return indices;
    }
}
