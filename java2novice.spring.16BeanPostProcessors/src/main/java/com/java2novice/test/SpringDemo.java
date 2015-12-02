package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.NetworkManager;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		NetworkManager networkMng = (NetworkManager) context.getBean("netManager");
		networkMng.readData();
		context.close();
	}
}
