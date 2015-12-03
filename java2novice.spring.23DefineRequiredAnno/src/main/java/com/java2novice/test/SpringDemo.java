package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;

/**
 * Finally the demo class, since we didn't pass order object to PaymentGateway class, we should expect exception here:
 * @author java2novice
 * @date 2015年12月3日下午2:22:19
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway myEmp = (PaymentGateway) context.getBean("paymentGateway");
		System.out.println(myEmp.toString());
	}
}
