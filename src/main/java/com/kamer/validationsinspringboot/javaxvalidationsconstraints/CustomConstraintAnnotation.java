package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import com.kamer.validationsinspringboot.javaxvalidationsconstraints.customannotation.CreditCard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomConstraintAnnotation {

	@NotEmpty(message = "You must enter a credit card number.")
	@CreditCard(message = "Invalid card number.")
	private String creditCard;

}
