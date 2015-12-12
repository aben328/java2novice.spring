package com.java2novice.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

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
