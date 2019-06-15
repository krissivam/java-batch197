package com.xsis.batch197.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DokumenController {
	
	@RequestMapping(value="/dokumen")
	public String dokumen() {
		return "dokumen/index";
	}

}
