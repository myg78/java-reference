package com.test.practice;

public class BinaryFlip {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;

		int setBits = countFlips(num1, num2);
		System.out.println(setBits);
	}
	
	private static int countFlips(int num1, int num2) {

		System.out.println(num1 + " " + Integer.toBinaryString(num1));
		System.out.println(num2 + " " + Integer.toBinaryString(num2));
		
		//calculate bits that changed using xor
		int xor = num1 ^ num2;
		System.out.println(xor + " " + Integer.toBinaryString(xor));
		
		//count set bits
		int setBits = countSetBits(xor);
		
		return setBits;
	}
	
	private static int countSetBits(int num) {
		int count = 0;
		while(num != 0) {
			count = count + (num & 1);
			//count += num & 1;
			num >>= 1;
		}
		
		return count;
	}
	
}
