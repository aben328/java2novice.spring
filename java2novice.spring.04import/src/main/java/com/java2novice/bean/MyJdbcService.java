package com.java2novice.bean;

/**
 * Spring java based configuration @Import example In the previous example we have seen how to load multiple xml based
 * configuration files. Spring 3 provides an alternative solution to move xml based configurations to java based
 * configurations. This page talks about how to load multiple java based configurations in the spring. We can achieve
 * this by using @Import annotation. Here is a simple bean which handles all jdbc related services:
 */
public class MyJdbcService {

	public void createJdbcConnection() {
		System.out.println("Creating jdbc connections...");
	}

}