package com.test.service;

public class TestServiceImpl implements TestService {

	@Override
	public String doService(String param) {
		return "hi " + param;
	}

}
