package com.test.practice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
//		String[] strs = {"flower","flow","fight"};//f
//		String[] strs = {"flower","flow","flight"};//fl
//		String[] strs = {"flower","flow","flowertest"};//flow
//		String[] strs = {"dog","racecar","car"};//none
		String[] strs = {"cart","caring","caress"};//none
		String lcp = longestCommonPrefix(strs);
		
		System.out.println("lcp: " + lcp);
	}
	
	public static String longestCommonPrefix(String[] strs) {
        
		String lcp = "";
		
		//base word - find shortest word
		//String base = strs[0];//assume first word for now
		String base = findShortestWord(strs);
		
		//iterate prefix
		String prefix = "";
		for (int i = 0; i < base.length(); i++) {
			
			prefix = base.substring(0, i+1);
			System.out.println("prefix: " + prefix);
			
			//search other array for prefix
			System.out.println("~~~~~~~~~");

			for (int j = 0; j < strs.length; j++) {
				
				String current = strs[j];
				int index = current.indexOf(prefix);
				
				System.out.println("current: " + current + " : " + prefix + " : " + index);
				if(current.indexOf(prefix)<0) {
					System.out.println("break: " + prefix + " : " + (prefix.length()-1));
					lcp = prefix.substring(0, prefix.length()-1);//remove last character
					return lcp;
				}
			}
		}
		
		//default to prefix
		lcp = prefix;
		
		return lcp;
    }
	
	private static String findShortestWord(String[] strs) {
		
		String shortest = null;
		for (int i = 0; i < strs.length; i++) {
			if(shortest==null) {
				shortest = strs[i];
			}
			if(strs[i].length()<shortest.length()) {
				shortest = strs[i];
			}
		}
		System.out.println("shortest: " + shortest);
		
		return shortest;
	}
	
}
