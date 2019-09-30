package com.kamer.validationsinspringboot.javaxvalidationsconstraints.customannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
public class CreditCardValidator implements ConstraintValidator<CreditCard, String> {

	private static final String CREDIT_CARD_REGEX = "^(?:4[0-9]{12}(?:[0-9]{3})?|[25][1-7][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$";

	private static final Pattern CREDIT_CARD_PATTERN = Pattern.compile(CREDIT_CARD_REGEX);

	@Override
	public void initialize(CreditCard constraintAnnotation) {

	}

	@Override
	public boolean isValid(String creditCardNumber, ConstraintValidatorContext context) {

		Matcher matcher = CREDIT_CARD_PATTERN.matcher(creditCardNumber);

		return matcher.matches();

	}
}
