package com.java2novice.bean;

/**
 * In the previous example we have seen Dependency injection via constructor and it is very simple. Lets take a case,
 * what if a class has two constructors with same number of input parameters with differen types of arguments? How does
 * spring dependency works? In this case spring gets into ambiguous situation. To resolve this, <br>
 * <br>
 * we must specify constructor input parameter type. Here is the example to specify input parameter type: <br>
 * <br>
 * @See more at: http://java2novice.com/spring/di-constructor-overloading/#sthash.YL4MXQOY.dpuf
 * @author java2novice
 */
public class Article {

	private String title;
	private int number;
	private String body;

	public Article(String title, int number) {
		this.title = title;
		this.number = number;
	}

	public Article(String title, String body) {
		this.title = title;
		this.body = body;
	}

}
