package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;

/**
 * Sometimes, we need to make sure that all the required dependencies are set to the spring bean. Spring
 * provides @Required annotation to check spring dependencies. If the required dependencies are not set, then it throws
 * BeanInitializationException. In this example, the PaymentGateway class has a dependency called Order class. In order
 * to check dependenty set @Required annotation to setOrder() method as shown below: -
 * @author java2novice
 * @date 2015年12月2日下午8:36:53
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
