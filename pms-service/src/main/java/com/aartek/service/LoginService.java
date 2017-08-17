package com.aartek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserLoginDto;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public UserLoginDto saveUser(UserLoginDto login) {
		if (login != null) {
			loginRepository.saveUser(login);
			return login;
		} else {
			return null;
		}

	}

	public UserLoginDto checkUser(UserLoginDto user) {
		List<UserLoginDto> userList = loginRepository.checkUser(user.getEmailId(), user.getPassword());
		if (userList != null && !userList.isEmpty()) {
			return userList.get(0);
		} else {
			return null;
		}
	}
}
