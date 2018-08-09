package com.test.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {

	private static final Map<Integer, String> numerals;
	
	//	Symbol       Value
	//	I             1
	//	V             5
	//	X             10
	//	L             50
	//	C             100
	//	D             500
	//	M             1000
	static {
		// init numerals map
		numerals = new LinkedHashMap<>();
		numerals.put(1000, "M");
		numerals.put(900, "CM");
		numerals.put(500, "D");
		numerals.put(400, "CD");
		numerals.put(100, "C");
		numerals.put(90, "XC");
		numerals.put(50, "L");
		numerals.put(40, "XL");
		numerals.put(10, "X");
		numerals.put(9, "IX");
		numerals.put(5, "V");
		numerals.put(4, "IV");
		numerals.put(1, "I");
	}
	
	public static void main(String[] args) {
		
		System.out.println(intToRoman(4945));
		
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i + " : " + intToRoman(i));
//		}
		
	}
	
	private static String intToRoman(int num) {
		
		StringBuffer sb = new StringBuffer();
		
		for (Map.Entry<Integer, String> entry : numerals.entrySet()) {

			Integer denom = entry.getKey();
		    String symbol = entry.getValue();
		    
		    while(num>= denom) {
		    	sb.append(symbol);
		    	num = num-denom;
		    }
		}
		
		return sb.toString();
	}
	
}
