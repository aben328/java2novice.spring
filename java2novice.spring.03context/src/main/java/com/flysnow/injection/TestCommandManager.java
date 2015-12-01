package com.flysnow.injection;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 可以通过控制台输出看到两次的输出借中的Command的地址是不一样的，因为我们为asyncCommand配置了scope="prototype"属性，这种方式就是使得每次从容器中取得的bean实例都不一样。
 * 通过这样方式我们实现了单例bean(commandManager)中的方法(process方法)引用非单例的bean(asyncCommand)。虽然我们实现了，但是这不是一种好的方法，因为我们的业务代码和Spring
 * Framework产生了耦合。
 */
public class TestCommandManager {
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	public void testProcess() {
		CommandManager manager = context.getBean("commandManager", CommandManager.class);
		System.out.println("第一执行process,Command的地址是:" + manager.process());
		System.out.println("第二执行process,Command的地址是:" + manager.process());
	}

}