package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.test.service.LogService;
import com.test.service.LogServiceImpl;
import com.test.service.PrintService;
import com.test.service.TestService;
import com.test.service.TestServiceImpl;
import com.test.util.StaticClass;

public class Java8 {

	public static void main(String[] args) {
		
		//testLambda();
		//testForEach();
		//testDefaultInterface();
		//testStreamFilter();
		//testStreamMatch();
		//testStreamMapReduce();
		testMethodReference();
	}
	
	private static void testLambda() {
		
		//implement inline
		TestService testService = new TestService() {
			@Override
			public String doService(String param) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		//implement separate class
		TestService testService2 = new TestServiceImpl();
		System.out.println(testService2.doService("mykz"));
		
		//lambda single line
		TestService testService3 = (param) -> "hello " + param;
		System.out.println(testService3.doService("mykz"));
		
		//lambda multiple lines
		TestService testService4 = (param) -> {
			return "hello there " + param;
		};
		System.out.println(testService4.doService("mykz"));
		
		//void lambda single line
		LogService logService1 = () -> System.out.println("log");
		logService1.log();
		
		//void lambda multiple lines
		LogService logService2 = () -> {
			String text = "test";
			System.out.println("log " + text);
		};
		logService2.log();
		
		//void param lambda single line
		PrintService printService1 = (param) -> System.out.println("print " + param);
		printService1.print("mykz");
		
		PrintService printService2 = (param) -> {
			String text = "temp";
			System.out.println("print " + text + " " + param);
		};
		printService2.print("mykz");
	}
	
	private static void testForEach() {
		
		List<String> list = new ArrayList<>();
		list.add("tony");
		list.add("peter");
		list.add("steve");
		
		//forEach implement Consumer
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("hello " + t);
			}
		});
		
		//forEach lambda single line
		list.forEach((current)->System.out.println("hello there " + current));
		
		//forEach lambda multiple lines
		list.forEach((current)->{
			String text = "hi there " + current;
			System.out.println(text);
		 }
		);
	}
	
	private static void testDefaultInterface() {
		
		LogService logService = new LogServiceImpl();
		
		//abstract method
		logService.log();
		
		//default method
		logService.log("mykz");
		
		//static
		LogService.logger("mykz");
	}
	
	private static void testStreamFilter() {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<100; i++) list.add(i);
		
		//sequential stream
		Stream<Integer> sequential = list.stream();
		Stream<Integer> filtered = sequential.filter(p -> p>80);
		filtered.forEach(current -> System.out.println("sequential= " + current));
		
		//parallel stream
		Stream<Integer> parallel = list.parallelStream();
		Stream<Integer> parallel2 = list.parallelStream();
		Stream<Integer> filteredParallel1 = parallel.filter(p -> p>80);
		//Stream<Integer> filteredParallel2 = parallel.filter(p -> p<40);//not possible to reuse after stream is used
		Stream<Integer> filteredParallel2 = parallel2.filter(p -> p<40);
		
		filteredParallel1.forEach(current -> System.out.println("parallel-1= " + current));
		filteredParallel2.forEach(current -> System.out.println("parallel-2= " + current));
	}
	
	private static void testStreamMatch() {
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		//List<Integer> intList = numbers.collect(Collectors.toList());
		//intList.forEach(i->System.out.println("number=" + i));
		
		//boolean match = numbers.anyMatch(i -> i==6);
		//System.out.println("match: " + match);
		
		boolean allMatch = numbers.allMatch(i -> i<5);
		System.out.println("allMatch: " + allMatch);
	}
	
	private static void testStreamMapReduce() {
		
		List<String> list = new ArrayList<>();
		list.add("Alice");
		list.add("tony");
		list.add("ab");
		list.add("cD");
		list.add("FEED");
		
		Stream<String> stream = list.stream();
		Stream<String> mapped = stream.map((i)-> i.toUpperCase());
		mapped.forEach((i)->System.out.println("i="+ i));
		
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		//int sum = numbers.reduce(0, (x,y)->x+y);
		int sum = numbers.reduce(0, Integer::sum);
		System.out.println("sum=" + sum);
	}
	
	private static void testMethodReference() {
		
		PrintService printService1 = (param) -> System.out.println("print " + param);
		printService1.print("mykz");
		
		PrintService printService2 = StaticClass::doSomething;
		printService2.print("kimi");
	}
	
}

