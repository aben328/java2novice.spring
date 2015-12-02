package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;

/**
 * Finally SpringDemo class:
 * @See more at: http://java2novice.com/spring/inject-inner-bean/#sthash.xmuwwiuQ.dpuf
 * @author java2novice
 * @date 2015年12月2日上午11:31:58
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGwBean");
		gateway.processOrder();
	}
}
