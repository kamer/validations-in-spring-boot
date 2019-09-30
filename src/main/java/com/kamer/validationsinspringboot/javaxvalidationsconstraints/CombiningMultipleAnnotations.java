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
@AllArgsConstructor
@NoArgsConstructor
public class CombiningMultipleAnnotations {

	@CombinedPasswordConstraint
	private String password;

}
