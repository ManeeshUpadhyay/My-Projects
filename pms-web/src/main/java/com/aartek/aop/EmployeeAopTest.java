package com.aartek.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAopTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("appilcationContextAop.xml");
		EmployeeAOP emp=(EmployeeAOP)context.getBean("employee");
		emp.getEmployeeById(1);
		emp.deleteEmployee(2);
		emp.getAllEmployee();
		emp.generateError();
	}
}
