/*package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.RegistrationDto;

@Component
public class RegistrationValidator implements Validator {

	public boolean supports(Class<?> clazz) {

		return RegistrationDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		RegistrationDto reg = (RegistrationDto) target;
		ValidationUtils.rejectIfEmpty(errors, "firstName", "error.fName.empty");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "error.lName.empty");
		ValidationUtils.rejectIfEmpty(errors, "contact", "error.contact.empty");
		ValidationUtils.rejectIfEmpty(errors, "address", "error.address.empty");
		ValidationUtils.rejectIfEmpty(errors, "emailId", "error.email.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.empty");

		if (reg.getEmailId() != null && reg.getEmailId().trim().length() > 0) {
			if (reg.getEmailId().contains("@") != true && reg.getEmailId().contains(".com") != true) {
				errors.rejectValue("emailId", "error.email.check");
			}
		}
		if (reg.getPassword() != null && reg.getPassword().trim().length() < 8) {
			errors.rejectValue("password", "error.password.check");
		}
		char[] contact = reg.getContact().toCharArray();

		for (int i = 0; i < contact.length; i++) {
			if (!Character.isDigit(contact[i])) {
				errors.rejectValue("contact", "error.contact.check");
				break;
			}
		}

	}

}
*/