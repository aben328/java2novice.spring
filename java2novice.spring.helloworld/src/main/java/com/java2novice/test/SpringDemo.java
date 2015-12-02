package com.java2novice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java2novice.beans.SpringFirstTest;

/**
 * http://java2novice.com/spring/spring-3-hello-world-example/
 * @author java2novice
 * @date 2015年12月1日下午7:44:16
 */
public class SpringDemo {

	public static void main(String a[]) {
		String confFile = "applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
		SpringFirstTest sft = (SpringFirstTest) context.getBean("springTest");
		sft.testMe();
	}
}

// See more at:http:// java2novice.com/spring/spring-3-hello-world-example/#sthash.APd6wQiC.dpuf
