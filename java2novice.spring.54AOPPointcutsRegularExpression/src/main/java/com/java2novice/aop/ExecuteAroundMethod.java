package com.java2novice.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Now create "Around Advice". Create a class which implements MethodInterceptor interface. You must call Object result
 * = metInvocation.proceed() method to proceed on the original method execution, else the original method will not
 * execute. 
 * @see more at: http://java2novice.com/spring/aop-pointcuts-regex/#sthash.cF87Q6sl.dpuf
 * @author java2novice
 * @date 2015年12月12日上午3:54:00
 */
public class ExecuteAroundMethod implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation metInvocation) throws Throwable {

		System.out.println("Inside RunBeforeExecution.before() method...");
		System.out.println("Running before advice...");
		try {
			Object result = metInvocation.proceed();

			System.out.println("Inside RunAfterExecution.afterReturning() method...");
			System.out.println("Running after advice...");

			return result;
		} catch (NullPointerException ne) {
			// this is for ThrowsAdvice
			throw ne;
		}

	}

}
