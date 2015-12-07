package com.java2novice.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class RunBeforeExecution implements MethodBeforeAdvice {

	@Override
	public void before(Method methodOrg, Object[] args, Object target) throws Throwable {
		System.out.println("Inside RunBeforeExecution.before() method...");
		System.out.println("Running before advice...");
	}
}
