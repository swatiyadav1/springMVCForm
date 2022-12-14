package com.springDemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.springDemo.mvc.validation.CourseCode;

public class Student {

	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String firstName;
	
	
	private String lastName;
	
	@NotNull(message="is required")
	@Max(value=18,message="must be less than 18")
	@Min(value=5,message="not less than 5")
	private Integer age;
	

	private String country;
	private String gender;
	private String[] hobbies;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 characters")
	private String postalCode;
	
	@CourseCode
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
