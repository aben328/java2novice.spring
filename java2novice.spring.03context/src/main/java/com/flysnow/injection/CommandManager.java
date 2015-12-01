package com.flysnow.injection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.flysnow.injection.command.Command;

/**
 * 在大部分情况下，容器中的bean都是singleton类型的。如果一个singleton bean要引用另外一个singleton bean，或者一个非singleton bean要引用另外一个非singleton
 * bean时，通常情况下将一个bean定义为另一个bean的property值就可以了。不过对于具有不同生命周期的bean来说这样做就会有问题了，比如在调用一个singleton类型bean
 * A的某个方法时，需要引用另一个非singleton（prototype）类型的bean B，对于bean A来说，容器只会创建一次，这样就没法在需要的时候每次让容器为bean A提供一个新的的bean B实例
 * ApplicationContextAware和BeanFactoryAware差不多，用法也差不多，实现了ApplicationContextAware接口的对象会拥有一个ApplicationContext的引用，
 * 这样我们就可以已编程的方式操作ApplicationContext。看下面的例子。</br>
 * </br>
 * @author http://flysnow.iteye.com/blog/733785
 * @date 2015年12月1日下午9:22:47
 */
public class CommandManager implements ApplicationContextAware {
	// 用于保存ApplicationContext的引用，set方式注入
	private ApplicationContext applicationContext;

	// 模拟业务处理的方法
	public Object process() {
		Command command = createCommand();
		return command.execute();
	}

	// 获取一个命令
	private Command createCommand() {
		return (Command) this.applicationContext.getBean("asyncCommand"); //
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;// 获得该ApplicationContext引用
	}
}