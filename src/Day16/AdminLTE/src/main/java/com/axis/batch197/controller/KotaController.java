package com.axis.batch197.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.axis.batch197.model.KotaModel;
import com.axis.batch197.model.ProvinsiModel;
import com.axis.batch197.repository.KotaRepo;
import com.axis.batch197.repository.ProvinsiRepo;

@Controller
@RequestMapping(value="/kota")
public class KotaController {
	private static final Logger logger = LoggerFactory.getLogger(KotaController.class);
	
	@Autowired
	private KotaRepo kotaRepo;
	
	@Autowired
	private ProvinsiRepo provinsiRepo;
	
	//method generate kode kota otomatis
	private String getKode() {
		String result="";
		if (kotaRepo.getMaxKode()!=null) {
			result = kotaRepo.getMaxKode().split("-")[1];
			result = "KT-" + String.format("%04d", (Integer.parseInt(result) + 1));
		}else {
			result = "KT-0001";
		}
		return result;
	}
	
	// #1. Index untuk menampilkann list data
	@GetMapping(value="/index")
	public ModelAndView index() {
		//buat object view
		ModelAndView view = new ModelAndView("kota/index");
		return view;
	}
	
	// #2. Membuat tampilan list data
	@GetMapping(value="/list")
	public ModelAndView list() {
		//buat object view
		ModelAndView view = new ModelAndView("kota/list");
		//load data kota via repo, disimpan ke dalam list
		List<KotaModel>list = kotaRepo.findAll();
		//lempar data ke view, list object baru, datanya listKota
		view.addObject("list", list);
		return view;
	}
	
	// #3. Membuat form ADD kota
	@GetMapping(value="/add")
	public ModelAndView create() {
		//buat object view
		ModelAndView view = new ModelAndView("kota/create");
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		KotaModel kota = new KotaModel();
		// isi kdKota dengan method getKode()
		kota.setKdKota(getKode());
		view.addObject("kota", kota);
		
		// mengambil data propinsi yang sudah ada
		List<ProvinsiModel>listProvinsi = provinsiRepo.findAll();
		// object listProp akan kita kirim ke view, agar pilihan provinsiId bisa terisi datanya
		view.addObject("listProvinsi", listProvinsi);
		return view;
	}
	
	// #4. Menangkap data dari form
	@PostMapping(value="/save")
	public ModelAndView save(@Valid @ModelAttribute("kota") KotaModel kota, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kota error");
		}else {
			kotaRepo.save(kota);
		}
		ModelAndView view = new ModelAndView("kota/create");
		view.addObject("kota", kota);
		return view;
	}
	
	// #5 Membuat form edit form
	@GetMapping(value="/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		//buat object view
		ModelAndView view = new ModelAndView("kota/update");
		//mengambil data dari repo
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		//membuat onject kota yg akan dikirim ke view
		//object kota adalah new object dari KotaModel
		view.addObject("kota", kota);
		
		//mengambil data provinsi yg sudah ada
		List<ProvinsiModel>listProvinsi = provinsiRepo.findAll();
		// object listProp akan kita kirim ke view, agar pilihan provinsiId bisa terisi datanya
		view.addObject("listProvinsi", listProvinsi);
		return view;
	}
	
	// #6. Menangkap data dari form
	@PostMapping(value="/update")
	public ModelAndView update(@Valid @ModelAttribute("kota") KotaModel kota, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save kota error");
		}else {
			kotaRepo.save(kota);
		}
		ModelAndView view = new ModelAndView("kota/update");
		view.addObject("kota", kota);
		return view;
	}
	
	// #7. Menampilkan form detail kota
	@GetMapping(value="/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		//buat object view
		ModelAndView view = new ModelAndView("kota/detail");
		//mengambil data dari repo
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		view.addObject("kota", kota);
		return view;
	}
	
	// #8. Menampilkan form delete
	@PostMapping(value="/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		//buat object view
		ModelAndView view = new ModelAndView("kota/delete");
		//mengambil data dari repo
		KotaModel kota = kotaRepo.findById(id).orElse(new KotaModel());
		// membuat object kota yg akan dikirim ke view
		// object kota adalah new object dari KotaModel
		view.addObject("kota", kota);
		return view;
	}
	
	// #9. Menangkap data dari form
	@PostMapping(value="/remove")
	public ModelAndView remove(@ModelAttribute("kota") KotaModel kota) {
		//remove data dari database
		kotaRepo.delete(kota);
		//membuat object view
		ModelAndView view = new ModelAndView("kota/delete");
		view.addObject("kota", kota);
		//redirect to index
		return view;
	}
}
