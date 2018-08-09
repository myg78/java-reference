package com.test.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintUtil {

	public static void main(String[] args) {
		
		int[] array = {1,2,5,4,6,9,8};
		printArrayLine(array);
		printArray(array);
		printMarker();
		
		String[] array2 = {"peter", "tony", "steve"};
		List<String> list = Arrays.asList(array2);
		printArrayList(list);
		printMarker();
		
		Map<String, Object> map = new HashMap<>();
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		printMap(map);
		printMarker();
		
		String name = "john";
		print("name");
		print("name", name);
		print("name", name, "list", list.size());
		printMarker();
	}
	
	public static void printArray(int[] array) {
		/*for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}*/
		Arrays.stream(array).forEach(System.out::println);
	}
	
	public static void printArrayLine(int[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	public static void printArrayList(List<String> list) {
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		//list.forEach(item->System.out.println(item));
		list.forEach(System.out::println);
	}
	
	public static void printMap(Map<String, Object> map) {
		/*for (Map.Entry<String, Object> entry : map.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println("key=" + key + " value=" + value);
		}*/
		map.forEach((key,value)-> System.out.println("key1=" + key + " value=" + value));
	}
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	public static void print(Object... items) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < items.length; i++) {
			if(i%2==0) {
				sb.append(items[i]);
				sb.append("=");
			}
			else {
				sb.append(items[i]);
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
	
	public static void printMarker() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
