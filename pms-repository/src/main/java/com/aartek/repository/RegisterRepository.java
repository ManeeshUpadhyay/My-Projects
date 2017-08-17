package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.RegistrationDto;

@Repository
public class RegisterRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public RegistrationDto registerRepo(RegistrationDto reg) {

		System.out.println("inside Repository method");
		System.out.println(reg.getFirstName() + ", " + reg.getLastName());
		return reg;
	}

	public boolean saveRegister(RegistrationDto reg) {

		if (reg != null) {
			hibernateTemplate.saveOrUpdate(reg);
			
			return true;
		} else {
			return false;
		}
	}
}
