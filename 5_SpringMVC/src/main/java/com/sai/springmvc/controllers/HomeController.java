package com.sai.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView homePageMethod() {
		
		//View Name
		ModelAndView model = new ModelAndView("home");
		
		//adding Model Object 
		model.addObject("My Name is ", "Sai Srinivas");
		
		return model;
		
	}

}