package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.ProjectDto;

@Component
public class ProjectValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		
		return ProjectDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "projectName", "error.projectName.empty");
		ValidationUtils.rejectIfEmpty(errors, "clientName", "error.clientName.empty");
		ValidationUtils.rejectIfEmpty(errors, "startDate", "error.startDate.empty");
		ValidationUtils.rejectIfEmpty(errors, "endDate", "error.endDate.empty");
		
		
	}

	
}
