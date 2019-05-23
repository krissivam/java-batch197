package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.FakultasModel;
import com.axis.batch197.siakad.repository.FakultasRepo;

@Controller
public class HomeController {
	
	@RequestMapping(value="/home/index")
	public String index() {
		return "home/index";
	}
		
}
