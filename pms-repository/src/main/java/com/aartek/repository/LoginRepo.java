package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.RegistrationDto;

@Repository
public class LoginRepo {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public boolean userLogin(String email, String password) {

		System.out.println("inside loginRepo");
		List<RegistrationDto> list = (List<RegistrationDto>) hibernateTemplate
				.find("from RegistrationDto reg where reg.emailId=? and reg.password=?", email, password);
		
		//System.out.println(list.get(0).getEmailId() + " " + list.get(0).getPassword());
		System.out.println(list);
		if (!list.isEmpty()) {
			//System.out.println("inside else repo"+list.get(0).getEmailId());
			return true;
		} else {
			System.out.println("inside else repo");
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public boolean checkEmail(String email) {

		List<RegistrationDto> list = hibernateTemplate.find("from RegistrationDto reg where reg.emailId=?", email);
		if (list.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
