package com.java2novice.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * BeanPostProcessor gives you a way to do some operations before creating the spring bean and immediately after
 * creating the spring bean. This allows you to add some custom logic before and after spring bean creation. The
 * BeanPostProcessors operate on bean (or object) instances which means that the Spring IoC container instantiates a
 * bean instance and then BeanPostProcessor interfaces do their work. Notice that the init and destroy methods related
 * to bean are different from bean post processors. BeanPostProcessors are common for all beans. This example clearly
 * shows the difference from them. To implement bean post processor logic, we need to create a class which implements
 * BeanPostProcessor interface and two of its methods.
 * @see more at: http://java2novice.com/spring/bean-post-processors/#sthash.azP2RM6i.dpuf
 */
public class MyBeanInitProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after initialization: " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before initialization: " + beanName);
		return bean;
	}
}
