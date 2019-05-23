package com.axis.batch197.siakad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.KelasModel;
import com.axis.batch197.siakad.repository.KelasRepo;

import java.util.List;

@Controller
public class KelasController {
	
	@Autowired
	private KelasRepo kelasRepo;
	private Integer id;
	
	@RequestMapping(value="/kelas/form")
	public String form() {
		return "kelas/form";
	}
	
	@RequestMapping(value="/kelas/save")
	public String save(@ModelAttribute KelasModel kelas) {
		kelasRepo.save(kelas);
		return "redirect:/kelas/list";
	}
	@RequestMapping(value = "/kelas/list")
	public String list(Model kirim) {
		List<KelasModel> kelasList = kelasRepo.findAll();
		kirim.addAttribute("kelasList", kelasList);
		return "kelas/list";
	}
	
	@RequestMapping(value="/kelas/edit/{id}")
	public String edit(Model kirim, @PathVariable(name="id")Integer id) {
		KelasModel kelasEdit = kelasRepo.findById(id).orElse(null);
		kirim.addAttribute("kelasEdit", kelasEdit);
		return "kelas/edit";
	}
	
	@RequestMapping(value="/kelas/hapus/{id}")
	public String hapus(@PathVariable(name="id") Integer id) {
		KelasModel kelasHapus = kelasRepo.findById(id).orElse(null);
		kelasRepo.delete(kelasHapus);
		return "redirect:/kelas/list";
	}
	
	

}

