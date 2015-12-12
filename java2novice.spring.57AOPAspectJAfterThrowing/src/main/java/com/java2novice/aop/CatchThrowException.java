package com.java2novice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.ThrowsAdvice;

/**
 * Here is the Aspect class example. The afterThrowing() method will be executed after any exception got throwed. Note
 * here you have specified "throwing" attribute as part of your annotation. Make sure that the annotation throwing
 * attribute value should be same as method input parameter.
 * @author java2novice
 * @date 2015年12月12日下午8:40:30
 */
@Aspect
public class CatchThrowException implements ThrowsAdvice {

	@AfterThrowing(pointcut = "execution(* com.java2novice.bean.MyBusinessService.testThrowException(..))", throwing = "excep")
	public void afterThrowing(JoinPoint joinPoint, Throwable excep) throws Throwable {
		System.out.println("Inside CatchThrowException.afterThrowing() method...");
		System.out.println("Running after throwing exception...");
		System.out.println("Exception : " + excep);
	}
}
