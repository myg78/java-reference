package com.test.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {

	public static void main(String[] args) {
		
//		intToRoman(3);//	III
//		intToRoman(4);//	IV
//		intToRoman(5);//	V
//		intToRoman(8);//	VIII
//		intToRoman(9);//	IX
//		intToRoman(10);//	X
		
		intToRoman(39);//	X
	}
	
	//	Symbol       Value
	//	I             1
	//	V             5
	//	X             10
	//	L             50
	//	C             100
	//	D             500
	//	M             1000
	private static String intToRoman(int num) {
		
		convert(num);
		
		return null;
	}
	
	private static String convert(int num) {
	
		// init numerals map
		Map<Integer, String> numerals = new LinkedHashMap<>();
		numerals.put(1000, "M");
		numerals.put(500, "D");
		numerals.put(100, "C");
		numerals.put(50, "L");
		numerals.put(10, "X");
		numerals.put(5, "V");
		numerals.put(1, "I");
		
		StringBuffer sb = new StringBuffer();
		int baseDenom = 0;
    	String baseSymbol = "";
    	
		for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
		    Integer denom = entry.getKey();
		    System.out.println("denom=" + denom);
		    
		    int q = num/denom;
		    if(q>0) {
		    	baseDenom = denom;
		    	baseSymbol = entry.getValue();
		    	break;
		    }
		}
		
		// start from base denomination
		handle(num, baseDenom, baseSymbol, sb, numerals);
		
		System.out.println(sb.toString());
		
		return sb.toString();
	}
	
	
	private static void handle(int num, int denom, String symbol, StringBuffer sb, Map<Integer, String> numerals) {
		
		System.out.println("~~~~~~~~~~~");
		System.out.println("handle: num=" + num + " denom=" + denom);
		
		int q = num/denom;
		System.out.println("q: " + q);
		
		if (q >= 1) {
			if(q>3) {
				System.out.println("exception 3");
				getNext(num);
			} else {
				//quotient
				sb.append(repeat(symbol, q));
				
				//remainder
				int r = num % denom;
				if (r == 0) {
					System.out.println("by " + denom);
				} else {
					System.out.println("r " + r);
					process(r, sb, numerals);
				}
			}
		}
	}
	
	private static void handleAlt(int r) {
		
	}
	
	private static void getNext(int num) {
		
	}
	
	private static void process(int r, StringBuffer sb, Map<Integer, String> numerals) {
		System.out.println("process: " + r);
		if(r<5) {
			System.out.println("inside <5");
			handle(r, 1, "I", sb, numerals);
		}
		else if(r<10) {
			System.out.println("inside <10");
			handle(r, 5, "V", sb, numerals);
		}
		else if(r<50) {
			System.out.println("inside <50");
			handle(r, 10, "X", sb, numerals);
		}
		else if(r<100) {
			System.out.println("inside <50");
			handle(r, 50, "L", sb, numerals);
		}
	}
	
	private static String repeat(String symbol, int count) {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += symbol;
		}
		return str;
	}
	
	
}
