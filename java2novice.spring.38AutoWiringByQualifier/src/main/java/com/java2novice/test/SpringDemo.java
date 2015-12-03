package com.java2novice.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;
import com.java2novice.beans.PaymentGateway2;

/**
 * Spring bean demo class:
 * @author java2novice
 * @date 2015年12月3日下午5:07:51
 */
public class SpringDemo {

	@Test
	public void test1() throws Exception {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
		System.out.println(paymentGateway.toString());
	}

	@Test
	public void test2() throws Exception {
		String confFile = "applicationContext2.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway2 paymentGateway2 = (PaymentGateway2) context.getBean("paymentGateway");
		System.out.println(paymentGateway2.toString());
	}

}