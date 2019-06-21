package com.axis.batch197.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.axis.batch197.model.XAddressBookModel;
import com.axis.batch197.service.UserService;


@Controller
public class AuthenticationController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
//		List<XAddressBookModel> address = repo.search(email, abpwd);
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		XAddressBookModel pengguna = new XAddressBookModel();
		modelAndView.addObject("pengguna", pengguna);
		modelAndView.setViewName("register"); // resources/template/register.html
		return modelAndView;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index"); // resources/template/home.html
		return modelAndView;
	}
	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView registerPengguna(@Valid XAddressBookModel pengguna, BindingResult bindingResult, ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		// Check for the validations
		if(bindingResult.hasErrors()) {
			modelAndView.addObject("successMessage", "Please correct the errors in form!");
			modelMap.addAttribute("bindingResult", bindingResult);
		}
		else if(userService.isUserAlreadyPresent(pengguna)){
			modelAndView.addObject("successMessage", "user already exists!");			
		}
		// we will save the user if, no binding errors
		else {
			userService.savePengguna(pengguna);
			modelAndView.addObject("successMessage", "User is registered successfully!");
		}
		modelAndView.addObject("pengguna", new XAddressBookModel());
		modelAndView.setViewName("register");
		return modelAndView;
	}

}
