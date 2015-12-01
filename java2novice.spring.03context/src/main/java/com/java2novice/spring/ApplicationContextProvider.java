package com.java2novice.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * This page gives an example to get spring application context object with in non spring managed classes as well. It is
 * not possible to have all classes as spring managed classes, in such classes you need to get spring application
 * context object. This can be achieved by using ApplicationContextAware interface. Here are the steps to achieve
 * application context object: Create a new class and implement ApplicationContextAware method and its unimplemented
 * method as shown below: -
 * @See more at: http://java2novice.com/spring/application-context-object/#sthash.qdyTbubo.dpuf
 * @See more at: http://blog.csdn.net/kaiwii/article/details/6872642
 * @see more at: http://flysnow.iteye.com/blog/733785
 */
public class ApplicationContextProvider implements ApplicationContextAware {

	private static ApplicationContext context;

	public ApplicationContext getApplicationContext() {
		return context;
	}

	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		context = ac;
	}
}
