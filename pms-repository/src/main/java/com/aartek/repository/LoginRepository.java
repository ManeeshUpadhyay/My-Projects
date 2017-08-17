package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLoginDto;

@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public UserLoginDto saveUser(UserLoginDto login) {
		if (login != null) {
			hibernateTemplate.saveOrUpdate(login);
			return login;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<UserLoginDto> checkUser(String emailId, String password) {

		if (emailId != null && password != null) {
			List<UserLoginDto> userLogin = hibernateTemplate.find("from UserLoginDto where emailId=? and password=?",
					emailId, password);
			if (userLogin != null) {
				return userLogin;
			}

		}
		return null;
	}
}
