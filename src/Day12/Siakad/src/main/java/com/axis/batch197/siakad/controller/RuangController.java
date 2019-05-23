package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.KelasModel;
import com.axis.batch197.siakad.model.RuangModel;
import com.axis.batch197.siakad.repository.KelasRepo;
import com.axis.batch197.siakad.repository.RuangRepo;


@Controller
public class RuangController {
	
	@Autowired
	private RuangRepo ruangRepo;
	
	@Autowired
	private KelasRepo kelasRepo;
	
	@RequestMapping(value="/ruang/form")
	public String form(Model kelas) {
		List<KelasModel> listKelas = kelasRepo.findAll();
		kelas.addAttribute("listKelas", listKelas);
		return "ruang/form";
	}
	
	@RequestMapping(value = "/ruang/save")
	public String save(@ModelAttribute RuangModel kelas) {
		ruangRepo.save(kelas);
		return "redirect:/ruang/list";
	}
	
	@RequestMapping(value = "/ruang/list")
	public String list(Model kirim) {
		List<RuangModel> ruangList = ruangRepo.findAll();
		kirim.addAttribute("ruangList", ruangList);
		return "ruang/list";
	}
	
	@RequestMapping(value = "/ruang/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		RuangModel ruangEdit = ruangRepo.findById(id).orElse(null);
		kirim.addAttribute("ruangEdit", ruangEdit);
		return "ruang/edit";
	}
	
	@RequestMapping(value = "/ruang/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		RuangModel ruangHapus = ruangRepo.findById(id).orElse(null);
		ruangRepo.delete(ruangHapus);
		return "redirect:/ruang/list";
	}

}
