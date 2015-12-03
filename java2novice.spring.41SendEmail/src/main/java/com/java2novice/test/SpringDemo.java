package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.services.EmailService;

public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		EmailService emailService = (EmailService) context.getBean("emailService");
		String toAddr = "aben328@163.com";
		String fromAddr = "aben328@163.com";
		String subject = "My Test Mail";
		String body = "Test mail body";
		emailService.sendEmail(toAddr, fromAddr, subject, body);
	}
}
