package com.java2novice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RunAfterExecution {

	@AfterReturning(pointcut = "execution(* com.java2novice.bean.MyBusinessService.runMyBusinessLogic(..))", returning = "returnValue")
	public void runAfter(JoinPoint joinPoint, String returnValue) throws Throwable {

		System.out.println("Inside RunAfterExecution.afterReturning() method...");
		System.out.println("inserted after : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + returnValue);
	}
}