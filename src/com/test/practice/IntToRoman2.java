package com.test.practice;

public class IntToRoman2 {

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
		
		handle(num);
		
		return null;
	}
	
	private static void handle(int num) {
		StringBuffer sb = new StringBuffer();
		handle(num, 10, "X", sb);
		System.out.println(num + " = " + sb.toString());
	}
	
	private static void handle(int num, int denom, String symbol, StringBuffer sb) {
		
		System.out.println("~~~~~~~~~~~");
		System.out.println("handle: num=" + num + " denom=" + denom);
		
		int q = num/denom;
		System.out.println("q: " + q);
		
		if (q >= 1) {
			
			//quotient
			sb.append(repeat(symbol, q));
			
			//remainder
			int r = num % denom;
			if (r == 0) {
				System.out.println("by " + denom);
			} else {
				System.out.println("r " + r);
				process(r, sb);
			}
		}
	}
	
	private static void handleBelow() {
		
	}
	
	private static void process(int r, StringBuffer sb) {
		System.out.println("process: " + r);
		if(r<5) {
			System.out.println("inside <5");
			handle(r, 1, "I", sb);
		}
		else if(r<10) {
			System.out.println("inside <10");
			handle(r, 5, "V", sb);
		}
		else if(r<50) {
			System.out.println("inside <50");
			handle(r, 10, "X", sb);
		}
		else if(r<100) {
			System.out.println("inside <50");
			handle(r, 50, "L", sb);
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
