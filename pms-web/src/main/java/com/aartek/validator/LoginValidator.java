package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.UserLoginDto;

@Component
public class LoginValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return UserLoginDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		UserLoginDto user = (UserLoginDto) target;
		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");
		if (user.getEmailId() != null && user.getEmailId().trim().length() > 0) {
			if (user.getEmailId().contains("@") != true && user.getEmailId().contains(".com") != true) {

				errors.rejectValue("emailId", "error.email.check");
			}
		}
		if (user.getPassword() != null && user.getPassword().trim().length() < 8) {
			errors.rejectValue("password", "error.password.check");
		}
	}

}
