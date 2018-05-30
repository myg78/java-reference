package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.test.beans.Car;
import com.test.service.LogService;
import com.test.service.TestService;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world");
		//System.out.println("Test again");
//		testString();
//		testSet();
//		testCar();
		testLambda();
	}
	
	public static void testString() {
		String str = "string1";
		System.out.println(str.hashCode());
		str = "string2";
		System.out.println(str.hashCode());
		String str3 = "string3";
		System.out.println(str3.hashCode());
	}
	
	public static void testSet() {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("p");
		hashSet.add("a");
		
		for (Iterator iterator = hashSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("~~~~~~~~~~~~~~~");
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("p");
		treeSet.add("a");
		for (Iterator iterator = treeSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	
	public static void testCar() {
		Car car1 = new Car();
		car1.setMake("Honda");
		System.out.println(car1.getMake());
		testCarChange(car1);
		System.out.println(car1);
		System.out.println(car1.hashCode());
		System.out.println(car1.getMake());
	}
	
	public static void testCarChange(Car car) {
		System.out.println("~~~~~~~~~~~");
		car = new Car();
		System.out.println(car.hashCode());
		car.setMake("Ford");
	}
	
	public static void testLambda() {
		
		TestService testService = (param) -> "hello " + param;
//		TestService testService = (param) -> {
//				String response = "hello there " + param;
//				return response;
//			}; 
		System.out.println(testService.doService("john"));
		
		LogService logService = () -> System.out.println("log");
		logService.log();
		
	}
	
}
