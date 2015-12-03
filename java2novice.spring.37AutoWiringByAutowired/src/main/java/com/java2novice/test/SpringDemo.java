package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.beans.PaymentGateway;

/**
 * Spring bean demo class:
 * @author java2novice
 * @date 2015年12月3日下午5:07:51
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway paymentGateway = (PaymentGateway) context.getBean("paymentGateway");
		System.out.println(paymentGateway.toString());
	}
}