package com.test.practice;

public class StringAnagram {

	public static void main(String[] args) {
		
//		System.out.println(isAnagram(null, "army"));
//		System.out.println(isAnagram("", ""));
//		System.out.println(isAnagram("", "army"));
//		System.out.println(isAnagram("mary", "mary"));
//		System.out.println(isAnagram("maryme", "mearmy"));
	}
	
	private static boolean isAnagram(String str1, String str2) {
		
		System.out.println(str1 + " : " + str2);
		
		//check null
		if(str1==null || str2==null) {
			return false;
		}
		//check empty
		if(str1.isEmpty() || str2.isEmpty()) {
			return false;
		}
		//check equal
		if(str1.equalsIgnoreCase(str2)) {
			return true;
		}
		if(str1.length() != str2.length()) {
			return false;
		}
		//check anagram
		char[] chars = str1.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.println("~~~~~");
			System.out.println(chars[i]);
			
			int index = str2.indexOf(chars[i]);
			if(index>=0) {
				str2 = str2.substring(0, index) + str2.substring(index+1);//delete matching character
				System.out.println(str2);
			}
		}
		
		if(str2.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
