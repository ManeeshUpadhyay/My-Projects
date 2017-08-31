package com.aartek.controller;

import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.RegistrationDto;
import com.aartek.service.LoginService;
import com.aartek.validator.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private LoginValidator loginvalidator;
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		map.put("UserLoginDto", new RegistrationDto());
		System.out.println("Inside login Controller");
		Locale locale = LocaleContextHolder.getLocale();
		System.out.println("Current Locale : "+locale);
		return "login";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLogin(@ModelAttribute("UserLoginDto") RegistrationDto registration, BindingResult result,
			HttpServletRequest request) {

		loginvalidator.validate(registration, result);
		if (result.hasErrors()) {

			return "login";
		} else {

			System.out.println("Email : " + registration.getEmailId());
			System.out.println("Password : " + registration.getPassword());
			// String s = loginService.userLogin(registration);
			// System.out.println("inside after service="+s);

			HttpSession session = request.getSession();
			// session.setAttribute("emailId", s);

			return "showLoginStatus";

		}

	}
}
