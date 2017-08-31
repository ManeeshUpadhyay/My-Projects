package com.aartek.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {

	@Before("execution(* EmployeeAOP.getEmployeeById(..))")
	public void beforeExecution(JoinPoint join) {
		System.out.println("before Execution Method " + join.getSignature().getName());
	}

	@Before("execution(* EmployeeAOP.*(..))")
	public void beforeAllExecution(JoinPoint join) {
		System.out.println("All Method Run" + join.getSignature().getName());
	}

	@After("execution(* EmployeeAOP.deleteEmployee(..))")
	public void afterExecution(JoinPoint join) {
		System.out.println("delete Execution Method " + join.getSignature().getName());
	}

	@AfterReturning(pointcut = "execution(* EmployeeAOP.getAllEmployee(..))", returning = "object")
	public void returnAfter(JoinPoint join, Object object) {
		System.out.println("after returning method : " + join.getSignature().getName());
		System.out.println("value : " + object);

	}

	@AfterThrowing(pointcut = "execution(* EmployeeAOP.generateError(..))", throwing = "error")
	public void throwException(JoinPoint join, Throwable error) {
		System.out.println("throwException : " + join.getSignature().getName());
		System.out.println("error : " + error);
	}
}
