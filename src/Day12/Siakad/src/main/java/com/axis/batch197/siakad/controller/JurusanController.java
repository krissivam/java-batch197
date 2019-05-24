package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.FakultasModel;
import com.axis.batch197.siakad.model.JurusanModel;
import com.axis.batch197.siakad.repository.FakultasRepo;
import com.axis.batch197.siakad.repository.JurusanRepo;

@Controller
public class JurusanController {
	
	@Autowired
	private JurusanRepo jurusanRepo;
	
	@Autowired
	private FakultasRepo fakultasRepo;
	
	@RequestMapping(value="/jurusan/form")
	public String form(Model kirim) {
		List<FakultasModel> fakultasList = fakultasRepo.findAll();
		kirim.addAttribute("fakultasList", fakultasList);
		return "jurusan/form";
	}
	
	@RequestMapping(value = "/jurusan/save")
	public String save(@ModelAttribute JurusanModel jurusan) {
		jurusanRepo.save(jurusan);
		return "redirect:/jurusan/list";
	}
	
	@RequestMapping(value = "/jurusan/list")
	public String list(Model kirim) {
		List<JurusanModel> jurusanList = jurusanRepo.findAll();
		kirim.addAttribute("jurusanList", jurusanList);
		return "jurusan/list";
	}
	
	@RequestMapping(value = "/jurusan/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		JurusanModel jurusanEdit = jurusanRepo.findById(id).orElse(null);
		kirim.addAttribute("jurusanEdit", jurusanEdit);
		return "jurusan/edit";
	}
	
	@RequestMapping(value = "/jurusan/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		JurusanModel jurusanHapus = jurusanRepo.findById(id).orElse(null);
		jurusanRepo.delete(jurusanHapus);
		return "redirect:/jurusan/list";
	}

}
