package com.java2novice.test;

import com.java2novice.spring.ApplicationContextProvider;

public class SpringDemo {
	public static void main(String[] args) {
		ApplicationContextProvider appContext = new ApplicationContextProvider();
		@SuppressWarnings("unused")
		TestBean tb = appContext.getApplicationContext().getBean("testBean", TestBean.class);
	}
}
