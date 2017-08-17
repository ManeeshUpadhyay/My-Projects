package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.RegistrationDto;
import com.aartek.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;
	
	public RegistrationDto registerService(RegistrationDto reg) {
		
		System.out.println("inside register service method");
		System.out.println(reg.getFirstName()+", "+reg.getLastName());
		//registerRepository.registerRepo(reg);
		//registerRepository.saveRegister(reg);
		return reg;
	}
}
