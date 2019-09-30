package com.kamer.validationsinspringboot.javaxvalidationsconstraints.customannotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Documented
@Constraint(validatedBy = CreditCardValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CreditCard {

	String message() default "Invalid phone number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
