package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.service.J2nInventoryService;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		J2nInventoryService inventoryService = (J2nInventoryService) context.getBean("j2nInventoryService");
		inventoryService.testInventoryServce();
	}
}
