package com.axis.batch197.siakad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.KelasDetailModel;
import com.axis.batch197.siakad.repository.KelasDetailRepo;

import java.util.List;

@Controller
public class KelasDetailController {
	
	@Autowired
	private KelasDetailRepo kelasdetailRepo;
	
	@RequestMapping(value="/kelasdetail/form")
	public String form() {
		return "kelasdetail/form";
	}
	
	@RequestMapping(value="/kelasdetail/save")
	public String save(@ModelAttribute KelasDetailModel kelasdetail) {
		kelasdetailRepo.save(kelasdetail);
		return "redirect:/kelasdetail/list";
	}
	@RequestMapping(value = "/kelasdetail/list")
	public String list(Model kirim) {
		List<KelasDetailModel> kelasdetailList = kelasdetailRepo.findAll();
		kirim.addAttribute("kelasdetailList", kelasdetailList);
		return "kelasdetail/list";
	}
	
	@RequestMapping(value="/kelasdetail/edit/{id}")
	public String edit(Model kirim, @PathVariable(name="id")Integer id) {
		KelasDetailModel kelasdetailEdit = kelasdetailRepo.findById(id).orElse(null);
		kirim.addAttribute("kelasdetailEdit", kelasdetailEdit);
		return "kelasdetail/edit";
	}
	
	@RequestMapping(value="/kelasdetail/hapus/{id}")
	public String hapus(@PathVariable(name="id") Integer id) {
		KelasDetailModel kelasdetailHapus = kelasdetailRepo.findById(id).orElse(null);
		kelasdetailRepo.delete(kelasdetailHapus);
		return "redirect:/kelasdetail/list";
	}
	

}

