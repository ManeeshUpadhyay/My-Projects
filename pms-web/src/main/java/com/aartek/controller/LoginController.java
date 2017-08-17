package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLoginDto;
import com.aartek.service.LoginService;
import com.aartek.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private LoginValidator loginvalidator;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		map.put("UserLoginDto", new UserLoginDto());
		System.out.println("Inside login Controller");

		return "login";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLogin(@ModelAttribute("UserLoginDto") UserLoginDto user, BindingResult result) {

		loginvalidator.validate(user, result);
		if (result.hasErrors()) {

			return "login";
		}

		loginService.saveUser(user);
		return "showLoginStatus";

	}

}
