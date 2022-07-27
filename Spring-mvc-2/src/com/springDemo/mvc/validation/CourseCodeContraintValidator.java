package com.springDemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator<CourseCode, String> {

	
	
	
	private String coursePrefix;
	@Override
	public void initialize(CourseCode theCourseCode) {
//		ConstraintValidator.super.initialize(constraintAnnotation);
		
		
		coursePrefix=theCourseCode.value();
	}
	
	
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result = theCode.startsWith(coursePrefix);
		
		
		
		return result;
	}
	
	
	
	

}
