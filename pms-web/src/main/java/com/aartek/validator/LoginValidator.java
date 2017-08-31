package com.aartek.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.RegistrationDto;
import com.aartek.repository.LoginRepo;

@Component
public class LoginValidator implements Validator {
	@Autowired
	private LoginRepo loginRepo;

	public boolean supports(Class<?> clazz) {

		return RegistrationDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		RegistrationDto user = (RegistrationDto) target;

		if (user.getEmailId().trim().length() == 0) {
			ValidationUtils.rejectIfEmpty(errors, "emailId", "error.email.empty");
		} else if (user.getEmailId() != null && user.getEmailId().trim().length() > 0) {
			if (user.getEmailId().contains("@") != true && user.getEmailId().contains(".com") != true) {

				errors.rejectValue("emailId", "error.email.second.rule");
			} else if (!loginRepo.userLogin(user.getEmailId(), user.getPassword())) {
				errors.rejectValue("emailId", "error.password.third.rule");
			}
		} else {
			// emailId="valid";
		}

		if (user.getPassword().trim().length() == 0) {
			ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		} else if (user.getPassword() != null && user.getPassword().trim().length() < 8) {
			errors.rejectValue("password", "error.password.second.rule");
		} else {
			// password="valid";
		}

		/*
		 * if(emailId.matches("valid") && password.matches("valid")) { boolean
		 * b=loginRepo.checkEmail(user.getEmailId()); if(b==false) {
		 * errors.rejectValue("emailId", "error.email.already.exit"); } }
		 */

	}
}
