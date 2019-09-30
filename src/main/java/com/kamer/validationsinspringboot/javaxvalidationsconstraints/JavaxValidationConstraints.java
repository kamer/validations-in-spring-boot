package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDate;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JavaxValidationConstraints {

	@NotEmpty(message = "Name is a required field.")
	private String name;

	@Min(value = 3, message = "Experience must be at least 3 years.")
	private Integer experienceInYears;

	@PositiveOrZero(message = "You cannot have negative numbers of children.")
	private Integer numberOfChildren;

	@Size(min = 2, max = 35, message = "Surname must be 2-35 characters long.")
	private String surname;

	@Past(message = "Date input is invalid for a birth date.")
	private LocalDate dateOfBirth;

	@Pattern(regexp = "^4[0-9]{12}(?:[0-9]{3})?$", message = "Only Visa cards are accepted.")
	private String cardNumber;

	@Email(message = "Enter a valid email address.")
	private String email;

}
