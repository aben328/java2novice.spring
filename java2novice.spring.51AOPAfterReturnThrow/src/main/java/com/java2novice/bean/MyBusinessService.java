package com.java2novice.bean;

public class MyBusinessService {

	public void runMyBusinessLogic() {
		System.out.println("************************************");
		System.out.println("Running business logic...");
		System.out.println("************************************");
	}

	public void testThrowException() {
		throw new NullPointerException();
	}
}
