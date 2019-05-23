package com.axis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/home")
	public String index() {
		return "home/index";
	}

	@RequestMapping(value = "/home/contact-us")
	public String ContactUs() {
		return "home/contact-us";
	}

	@RequestMapping(value = "/home/link")
	public String Link() {
		return "home/link";
	}
}
