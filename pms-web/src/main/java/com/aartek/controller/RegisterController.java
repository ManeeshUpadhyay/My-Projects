package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.RegistrationDto;
import com.aartek.service.RegisterService;
//import com.aartek.validator.RegistrationValidator;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	/*
	 * @Autowired private RegistrationValidator registrationValidator;
	 */

	@RequestMapping(value = "/saveRegistration", method = RequestMethod.GET)
	public String showRegistration(Map<String, Object> map) {
		map.put("RegistrationDto", new RegistrationDto());
		System.out.println("Inside Controller");
		return "saveRegistration";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String checkRegistration(@ModelAttribute("RegistrationDto") RegistrationDto reg, BindingResult result) {

		/*
		 * //registrationValidator.validate(reg, result); if
		 * (result.hasErrors()) { return "saveRegistration"; }
		 */
		System.out.println(reg);
		
		registerService.registerService(reg);

		return "showReg";
	}
}
