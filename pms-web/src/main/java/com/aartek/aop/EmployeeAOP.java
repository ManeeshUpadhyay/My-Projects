package com.aartek.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aartek.model.EmployeeDto;

@Component
public class EmployeeAOP {

	public EmployeeDto getEmployeeById(Integer id) {
		System.out.println("getEmployeeBYId() method called");
		return new EmployeeDto();
	}

	public List<EmployeeDto> getAllEmployee() {

		System.out.println("getAllEmployee() method called");
		return new ArrayList<EmployeeDto>();
	}

	public void deleteEmployee(Integer id) {

		System.out.println("deleteEmployee() method called");
	}

	public void updateEmployee(EmployeeDto emp) {
		System.out.println("updateEmployee() method called");
	}
	public void generateError(){
	try {
		System.out.println(5/0);
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
		}
}
