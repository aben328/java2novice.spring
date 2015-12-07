package com.java2novice.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class RunAfterExecution implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method methodArg, Object[] args, Object target) throws Throwable {
		System.out.println("Inside RunAfterExecution.afterReturning() method...");
		System.out.println("Running after advice...");
	}
}
