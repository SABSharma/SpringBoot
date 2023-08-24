package com.springboot.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("this is home page ");
		return "Home";
	}
	
	@RequestMapping("/Names")
	public String name() {
		return "name";
	}

}
