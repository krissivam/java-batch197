package com.axis.batch197.siakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axis.batch197.siakad.model.JurusanModel;
import com.axis.batch197.siakad.model.MatakuliahModel;
import com.axis.batch197.siakad.repository.JurusanRepo;
import com.axis.batch197.siakad.repository.MatakuliahRepo;

@Controller
public class MatakuliahController {
	
	@Autowired
	private MatakuliahRepo matakuliahRepo;
	
	@Autowired
	private JurusanRepo jurusanRepo;
	
	@RequestMapping(value = "/home/matakuliah/matakuliah")
	public String matakuliah(Model jurusan) {
		List<JurusanModel> listJurusan = jurusanRepo.findAll();
		jurusan.addAttribute("listJurusan", listJurusan);
		return "home/matakuliah/matakuliah";
	}
	
	@RequestMapping(value = "/home/matakuliah/save")
	public String save(@ModelAttribute MatakuliahModel dataMatakuliah) {
		matakuliahRepo.save(dataMatakuliah);
		return "redirect:home/matakuliah/listMatakuliah";
	}
	
	@RequestMapping(value = "/home/matakuliah/listMatakuliah")
	public String list(Model kirim) {
		List<MatakuliahModel> matakuliahList = matakuliahRepo.findAll();
		kirim.addAttribute("matakuliahList", matakuliahList);
		return "home/matakuliah/listMatakuliah";
		
	}
	
	@RequestMapping(value = "/home/matakuliah/edit/{id}")
	public String edit(Model kirim, @PathVariable(name = "id") Integer id) {
		MatakuliahModel matakuliahEdit = matakuliahRepo.findById(id).orElse(null);
		kirim.addAttribute("matakuliahEdit", matakuliahEdit);
		return "home/matakuliah/matakuliahEdit";
	}
	
	@RequestMapping(value = "/home/matakuliah/hapus/{id}")
	public String hapus(@PathVariable(name = "id") Integer id) {
		MatakuliahModel matakuliahHapus = matakuliahRepo.findById(id).orElse(null);
		matakuliahRepo.delete(matakuliahHapus);
		return "redirect:home/matakuliah/listMatakuliah";
	}

}
