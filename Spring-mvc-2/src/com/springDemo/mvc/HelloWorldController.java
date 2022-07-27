package com.springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	
	
	//need a controller method to initial html form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process the html form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String convertUppper(HttpServletRequest request,Model model) {
		
		String theName=request.getParameter("studentName");
		
		theName=theName.toUpperCase();
		
		
		String msg = "hello !! " + theName;
		
		
		model.addAttribute("message",msg);
		
		
		
		
		
		return "helloworld";
		
		
	}
	

	@RequestMapping("/processFormVersionThree")
	public String convertUpper(@RequestParam("studentName") String theName,Model model) {
		
//		String theName=request.getParameter("studentName");
		
		theName=theName.toUpperCase();
		
		
		String msg = "hello !! " + theName;
		
		
		model.addAttribute("message",msg);
		
		
		
		
		
		return "helloworld";
		
		
	}

}
