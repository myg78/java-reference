package com.test.service;

public interface BoxService<T1, T2> {

	public void doService(T1 t1);
	public void init(T2 t2);
	
}
