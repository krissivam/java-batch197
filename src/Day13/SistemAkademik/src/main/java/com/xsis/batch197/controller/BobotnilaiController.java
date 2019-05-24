package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xsis.batch197.model.BobotnilaiModel;
import com.xsis.batch197.repository.BobotnilaiRepo;

@Controller
public class BobotnilaiController {
	
	@Autowired
	private BobotnilaiRepo bobotnilaiRepo;
	
	@RequestMapping(value ="/bobotnilai/index")
	public String index() {
		return"/bobotnilai/index";
	}
	
	@RequestMapping(value = "/bobotnilai/save")
	public String save(@ModelAttribute BobotnilaiModel bobotnilai) {
		bobotnilaiRepo.save(bobotnilai);
		return "redirect:/bobotnilai/list";
	}
	
	@RequestMapping(value = "/bobotnilai/list")
	public String list(Model kirim) {
		List<BobotnilaiModel> bobotnilaiList = bobotnilaiRepo.findAll();
		kirim.addAttribute("bobotnilaiList", bobotnilaiList);
		return "bobotnilai/list";
	}
	
	@RequestMapping(value = "/bobotnilai/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		BobotnilaiModel bobotnilaiEdit = bobotnilaiRepo.findById(id).orElse(null);
		kirim.addAttribute("bobotnilaiEdit", bobotnilaiEdit);
		return "bobotnilai/edit";
	}
	
	@RequestMapping(value = "/bobotnilai/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		BobotnilaiModel bobotnilaiHapus = bobotnilaiRepo.findById(id).orElse(null);
		bobotnilaiRepo.delete(bobotnilaiHapus);
		return "redirect:/bobotnilai/list";
	}
}
