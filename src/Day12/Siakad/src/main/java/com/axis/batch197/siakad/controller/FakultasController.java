package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.FakultasModel;
import com.axis.batch197.siakad.repository.FakultasRepo;

@Controller
public class FakultasController {

	@Autowired
	private FakultasRepo fakultasRepo;

	@RequestMapping(value = "/fakultas/form")
	public String fakultas() {
		return "fakultas/form";
	}

	@RequestMapping(value = "/fakultas/save")
	public String save(@ModelAttribute FakultasModel fakultas) {
		fakultasRepo.save(fakultas);
		return "redirect:/fakultas/list";
	}
	
	@RequestMapping(value = "/fakultas/list")
	public String list(Model kirim) {
		List<FakultasModel> fakultasList = fakultasRepo.findAll();
		kirim.addAttribute("fakultasList", fakultasList);
		return "fakultas/list";
	}
	
	@RequestMapping(value="/fakultas/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		FakultasModel fakultasEdit=fakultasRepo.findById(id).orElse(null);
		kirim.addAttribute("fakultasEdit", fakultasEdit);
		return "fakultas/edit";
	}
	@RequestMapping(value="/fakultas/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		FakultasModel fakultasEdit=fakultasRepo.findById(id).orElse(null);
		fakultasRepo.delete(fakultasEdit);
		return "redirect:/fakultas/list";
	}

}
