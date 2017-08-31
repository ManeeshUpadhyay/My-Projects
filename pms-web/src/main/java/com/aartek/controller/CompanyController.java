package com.aartek.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.CompanyDto;
import com.aartek.model.EmployeeDto;

@Controller
public class CompanyController {

	@RequestMapping(value = "/com_emp", method = { RequestMethod.GET, RequestMethod.POST })
	public String saveCompany(@ModelAttribute("CompanyDto") CompanyDto company, ModelMap map,
			HttpServletRequest request) {
		String method = request.getMethod();
		if (method.equals("GET")) {
			System.out.println("INSIDE COMPANY");
			return "company";

		} else {

			System.out.println("Name : " + company.getComName() + " Emp Name : ");
			List<EmployeeDto> emp = company.getEmpList();
			Iterator<EmployeeDto> itr = emp.iterator();
			while (itr.hasNext()) {
				EmployeeDto empDto = (EmployeeDto) itr.next();
				System.out.println(empDto.getEmpName());
			}

			return "company";
		}

	}

}
