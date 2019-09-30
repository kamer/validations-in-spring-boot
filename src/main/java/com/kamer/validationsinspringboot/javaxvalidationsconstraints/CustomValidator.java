package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Component
public class CustomValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return CustomValidationEntity.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		CustomValidationEntity customValidationEntity = (CustomValidationEntity) target;

		if (customValidationEntity.existEmployeeWithMail(customValidationEntity.getEmail())) {

			errors.rejectValue("email", null, "Employee with this email is already exists.");
		}

		if (!customValidationEntity.existManagerByDepartmentId(customValidationEntity.getDepartmentId())) {

			errors.reject(null, "Department does not have a manager.");
		}

	}
}
