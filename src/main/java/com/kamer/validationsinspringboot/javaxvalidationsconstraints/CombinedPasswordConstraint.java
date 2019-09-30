package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@NotEmpty
@Size(min = 8)
@Pattern(regexp = "\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]$\"")
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
public @interface CombinedPasswordConstraint {

	String message() default "Invalid password.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
