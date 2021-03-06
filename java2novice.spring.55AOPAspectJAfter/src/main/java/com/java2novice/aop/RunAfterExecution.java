package com.java2novice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RunAfterExecution {
 
    @After("execution(* com.java2novice.bean.MyBusinessService.runMyBusinessLogic(..))")
    public void runAfter(JoinPoint joinPoint) throws Throwable {
         
        System.out.println("Inside RunAfterExecution.afterReturning() method...");
        System.out.println("inserted after : " + joinPoint.getSignature().getName());
    }
}
