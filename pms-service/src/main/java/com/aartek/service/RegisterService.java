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
		
		if (reg != null) {
			registerRepository.saveRegister(reg);
			
			return reg;
		} else {
			return null;
		}
	}
}
