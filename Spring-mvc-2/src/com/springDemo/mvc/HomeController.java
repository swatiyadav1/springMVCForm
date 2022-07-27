package com.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}



/*
1- we want to create a new method to process form data

read the form data

convert it into uppercase

add it to the model


*/