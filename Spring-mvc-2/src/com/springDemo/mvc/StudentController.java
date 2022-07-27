package com.springDemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		
		Student theStudent=new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
		}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult) {
		
	
		if(theBindingResult.hasErrors()) {
			return "student-form";
		}
		else {
			return "student-confirmation";
		}
		
		
		
	}
}
