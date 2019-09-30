package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomValidationEntity {

	private String email;

	private Long departmentId;

	public Boolean existManagerByDepartmentId(Long departmentId) {

		return false;
	}

	public Boolean existEmployeeWithMail(String email) {

		return true;
	}

}