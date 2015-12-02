package com.java2novice.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.MyDbConfig;

/**
 * This page shows how to load property file from the classpath using xml based configuration. Declare your property
 * file in your xml based configuration file using "context:property-placeholder" tag, and refer property key any where
 * in the xml based configuration file using ${db.host.url} syntax.
 * @author java2novice
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
		System.out.println(dbConfig.toString());
		context.close();
	}

}
