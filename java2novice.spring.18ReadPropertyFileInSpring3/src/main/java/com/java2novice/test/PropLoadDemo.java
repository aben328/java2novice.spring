package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java2novice.beans.MyDbConfig;
import com.java2novice.config.MyApplicationConfig;

/**
 * In the previous example you have seen How to read property file in spring using xml based configuration file?. In
 * this example, you can see how to load property using java configuration:
 * @see http://java2novice.com/spring/read-property-file-java-config/
 * @author java2novice
 */
public class PropLoadDemo {

	public static void main(String a[]) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
		MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
		System.out.println(dbConfig.toString());
	}
}
