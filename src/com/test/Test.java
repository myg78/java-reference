package com.test;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

import javax.management.Query;

import com.test.beans.Car;
import com.test.service.LogService;
import com.test.service.TestService;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main");
		//System.out.println("Test again");
//		testString();
//		testSet();
//		testCar();
//		testLambda();
//		testInput(args);
//		testQueue();
		testStack();
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
	
	public static void testHash() {
		
		Hashtable<Object, Long> lock = new Hashtable<>();
		Hashtable<Object, Long> unlock = new Hashtable<>();
		
		Enumeration<Object> keys = unlock.keys();
		while(keys.hasMoreElements()) {
			Object object = keys.nextElement();
			
			//check if object is not expired
			
			//if not expired, perform validate
			//if valid, return t
			
			//else create new object
		}
	}
	
	public static void testLinkedList() {
		
		List<String> list = new LinkedList<>();
		
	}
	
	public static void testInput(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg: " + args[i]);
		}
	}
	
	public static void testQueue() {

		Queue<String> queue = new LinkedList<>();
		queue.add("peter");
		queue.add("tony");
		queue.add("steve");
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
	}
	
	public static void testStack() {
		
		Stack<String> stack = new Stack<>();
		stack.push("peter");
		stack.push("tony");
		stack.push("steve");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
}
