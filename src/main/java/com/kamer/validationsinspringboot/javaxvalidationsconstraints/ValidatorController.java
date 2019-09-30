package com.kamer.validationsinspringboot.javaxvalidationsconstraints;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * Created on September, 2019
 *
 * @author kamer
 */
@Controller
@AllArgsConstructor
public class ValidatorController {

	private final CustomValidator customValidator;

	@InitBinder
	private void bindValidator(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(customValidator);
	}

	@GetMapping("/javax-constraints")
	String javaxConstraints(JavaxValidationConstraints javaxValidationConstraints) {

		return "javax-constraints";
	}

	@PostMapping("/javax-constraints")
	String postJavaxConstraints(@Valid JavaxValidationConstraints javaxValidationConstraints, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "javax-constraints";
		}
		else {
			// Both conditions returns the same page.
			// It's not done by accident.
			// Just wanted to show usage of bindingResult.hasErrors()
			return "javax-constraints";
		}
	}

	@GetMapping("/custom-constraint-annotation")
	String customConstraint(CustomConstraintAnnotation customConstraintAnnotation) {

		return "custom-constraint-annotation";
	}

	@PostMapping("/custom-constraint-annotation")
	String postCustomConstraint(@Valid CustomConstraintAnnotation customConstraintAnnotation, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "custom-constraint-annotation";
		}
		else {
			// Both conditions returns the same page.
			// It's not done by accident.
			// Just wanted to show usage of bindingResult.hasErrors()
			return "custom-constraint-annotation";
		}

	}

	@GetMapping("/combined-constraint")
	String combinedConstraint(CombiningMultipleAnnotations combiningMultipleAnnotations) {

		return "combined-constraint";
	}

	@PostMapping("/combined-constraint")
	String postCombinedConstraint(@Valid CombiningMultipleAnnotations combiningMultipleAnnotations, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "combined-constraint";
		}
		else {
			// Both conditions returns the same page.
			// It's not done by accident.
			// Just wanted to show usage of bindingResult.hasErrors()
			return "combined-constraint";
		}

	}

	@GetMapping("/custom-validator")
	String customValidator(CustomValidationEntity customValidationEntity) {

		return "custom-validator";
	}

	@PostMapping("/custom-validator")
	String postCustomValidator(@Valid CustomValidationEntity customValidationEntity, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "custom-validator";
		}
		else {
			// Both conditions returns the same page.
			// It's not done by accident.
			// Just wanted to show usage of bindingResult.hasErrors()
			return "custom-validator";
		}

	}


}
