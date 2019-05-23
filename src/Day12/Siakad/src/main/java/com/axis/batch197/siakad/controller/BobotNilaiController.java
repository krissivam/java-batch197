package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.BobotNilaiModel;
import com.axis.batch197.siakad.repository.BobotNilaiRepo;


@Controller
public class BobotNilaiController {
	
	@Autowired
	private BobotNilaiRepo bobotnilaiRepo;
	
	@RequestMapping(value ="/bobotnilai/form")
	public String index() {
		return"bobotnilai/form";
	}
	
	@RequestMapping(value = "/bobotnilai/save")
	public String save(@ModelAttribute BobotNilaiModel bobotnilai) {
		bobotnilaiRepo.save(bobotnilai);
		return "redirect:/bobotnilai/list";
	}
	
	@RequestMapping(value = "/bobotnilai/list")
	public String list(Model kirim) {
		List<BobotNilaiModel> bobotnilaiList = bobotnilaiRepo.findAll();
		kirim.addAttribute("bobotnilaiList", bobotnilaiList);
		return "bobotnilai/list";
	}
	
	@RequestMapping(value = "/bobotnilai/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		BobotNilaiModel bobotnilaiEdit = bobotnilaiRepo.findById(id).orElse(null);
		kirim.addAttribute("bobotnilaiEdit", bobotnilaiEdit);
		return "bobotnilai/edit";
	}
	
	@RequestMapping(value = "/bobotnilai/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		BobotNilaiModel bobotnilaiHapus = bobotnilaiRepo.findById(id).orElse(null);
		bobotnilaiRepo.delete(bobotnilaiHapus);
		return "redirect:/bobotnilai/list";
	}
}
