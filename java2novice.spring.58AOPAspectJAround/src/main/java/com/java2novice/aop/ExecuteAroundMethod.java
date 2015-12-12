package com.java2novice.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Here is the Aspect class example. The invoke() method will be called before executing runMyBusinessLogic() method.
 * Also you have to define joinPoint.proceed() to control when should the interceptor return the control to the original
 * calling method runMyBusinessLogic(). - See more at:
 * @author java2novice
 * @date 2015年12月12日下午8:46:56
 */
@Aspect
public class ExecuteAroundMethod {

	@Around("execution(* com.java2novice.bean.MyBusinessService.runMyBusinessLogic(..))")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("Inside RunBeforeExecution.before() method...");
		System.out.println("Running before advice...");
		try {
			Object result = joinPoint.proceed();
			System.out.println("Inside RunAfterExecution.afterReturning() method...");
			System.out.println("Running after advice...");
			return result;
		} catch (Exception ne) {
			throw ne;
		}
	}
}
