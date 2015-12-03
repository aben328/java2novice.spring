package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.PaymentGateway;

/**
 * Spring 3 introduced the Spring Expression Language (SpEL), a powerful expression language, used to wire values into
 * bean’s properties. It’s an expression language similar to other ELs, that supports querying and manipulating(操纵) an
 * object graph at runtime. <br>
 * <br>
 * This page gives introduction to spring expression language with basic example using xml based configuration, you can
 * see more examples in the next pages. Here is the spring beans
 * @see http://java2novice.com/spring/expression-language-example/
 * @author java2novice
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		PaymentGateway gateway = (PaymentGateway) context.getBean("paymentGateway");
		gateway.processOrder();
	}
}
