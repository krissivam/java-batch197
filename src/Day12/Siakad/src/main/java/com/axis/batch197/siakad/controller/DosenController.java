package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.DosenModel;
import com.axis.batch197.siakad.repository.DosenRepo;



@Controller
public class DosenController {
	@Autowired
	private DosenRepo dosenRepo;

	@RequestMapping(value = "/dosen/form")
	public String index() {
		return "/dosen/form";
	}

	@RequestMapping(value = "/dosen/save")
	public String save(@ModelAttribute DosenModel dosen) {
		dosenRepo.save(dosen);
		return "redirect:/dosen/list";
	}

	@RequestMapping(value = "/dosen/list")
	public String list(Model kirim) {
		List<DosenModel> dosenList = dosenRepo.findAll();
		kirim.addAttribute("dosenList", dosenList);
		return "dosen/list";
	}

	@RequestMapping(value = "/dosen/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		DosenModel dosenEdit = dosenRepo.findById(id).orElse(null);
		kirim.addAttribute("dosenEdit", dosenEdit);
		return "dosen/edit";
	}

	@RequestMapping(value = "/dosen/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		DosenModel dosenHapus = dosenRepo.findById(id).orElse(null);
		dosenRepo.delete(dosenHapus);
		return "redirect:/dosen/list";
	}
}
