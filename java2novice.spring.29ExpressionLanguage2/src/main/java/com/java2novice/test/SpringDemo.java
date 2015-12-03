
package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.java2novice.beans.PaymentGateway;

/**
 * Spring 3 introduced the Spring Expression Language (SpEL), a powerful expression language, used to wire values into
 * bean’s properties. It’s an expression language similar to other ELs, that supports querying and manipulating an
 * object graph at runtime. <br>
 * <br>
 * This page gives introduction to spring expression language with basic example using annotations, you can see more
 * examples in the next pages. Previous page has given example using xml based configuration. Here is the spring beans.
 * You must register your beans using @Component, and specify your expression language using @Value annotation: <br>
 * <br>
 * In the below bean class, the expression language #{beanOrder} assigns "beanOrder" reference to order property, and
 * #{beanOrder.item} assigns beanOrder item name to item property. <br>
 * <br>
 * - See more at: http://java2novice.com/spring/expression-language-annotation-example/#sthash.YMe4jJph.dpuf
 * @author java2novice
 * @date 2015年12月3日下午3:41:34
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