package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.RegistrationDto;
import com.aartek.repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	private LoginRepo loginRepo;

/*	public String userLogin(RegistrationDto reg) {

		//String s = loginRepo.userLogin(reg.getEmailId(), reg.getPassword());
		System.out.println("inside service after repo="+s);
		
		return s;
	}*/

	public boolean checkEmail(String email) {
		boolean result = loginRepo.checkEmail(email);
		if (result == true) {
			return true;
		} else {
			return false;
		}
	}
}
