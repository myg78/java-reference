package com.test.practice;

public class ReverseString {

	public static void main(String[] args) {
	
//		reverseStringBuilder(null);
//		reverseStringBuilder("");
//		reverseStringBuilder("testing");
//		reverseStringBuilder("the quick brown");
		
		reverseString(null);
		reverseString("");
		reverseString("testing");
		reverseString("the quick brown");
		reverseString("peter parker");
	}
	
	private static String reverseStringBuilder(String str) {
		
		String reverse = "";
		
		if(str!=null && !str.isEmpty()) {
			// using String Builder
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(str);
			reverse = stringBuilder.reverse().toString();
		}
		
		System.out.println("reverseStringBuilder: " + str + " : " + reverse);
		
		return reverse;
	}
	
	private static String reverseString(String str) {
		
		String reverse = "";
		if(str!=null && !str.isEmpty()) {
			for (int i = str.length()-1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);
			}
		}
		System.out.println("reverseString: " + str + " : " + reverse);
		
		return reverse;
	}
	
}
