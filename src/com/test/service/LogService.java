package com.test.service;

@FunctionalInterface
public interface LogService {

	public void log();
	
	default public void log(String param) {
		System.out.println("log " + param);
	}
	
	static public void logger(String param) {
		System.out.println("logger " + param);
	}
	
}
