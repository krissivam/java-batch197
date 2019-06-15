package com.xsis.batch197.controller.penggunaController;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.XAddressBookModel;
import com.xsis.batch197.repository.XAddressBookRepo;

@Controller
@RequestMapping(value="/pengguna")
public class PenggunaController {
	
	private static final Logger logger = LoggerFactory.getLogger(PenggunaController.class);

	@Autowired
	private XAddressBookRepo repoXAddressBook;
	
	// #1. index => list data
	@GetMapping(value = "/index")
	public ModelAndView index() {
		// buat object view
		ModelAndView view = new ModelAndView("pengguna/index");
		return view;
	}
	
	// #1. index => list data
	@GetMapping(value = "/list")
	public ModelAndView list() {
		// buat object view
		ModelAndView view = new ModelAndView("pengguna/list");
		// load data pengguna via repo, disimpan kedalam list
		List<XAddressBookModel> listPengguna = repoXAddressBook.findAll();
		// lemparkan data ke view, list object baru, datanya listprovinsi
		view.addObject("listPengguna", listPengguna);
		return view;
	}
	
	// #2. Membuat Form Add pengguna
	@GetMapping(value = "/add")
	public ModelAndView create() {
		// buat object view
		ModelAndView view = new ModelAndView("pengguna/create");
		// membuat object provinsi yg akan dikirim ke view
		// object provinsi adalah new object dari ProvinsiModel
		XAddressBookModel pengguna = new XAddressBookModel();
		view.addObject("pengguna", pengguna);
		return view;
	}
	
	// #3. Menangkap data dari form
	@PostMapping(value = "/save")
	public ModelAndView save(@Valid @ModelAttribute("pengguna") XAddressBookModel pengguna, BindingResult result) {
		if (result.hasErrors()) {
			logger.info("save pengguna error");
		} else {
			repoXAddressBook.save(pengguna);
		}

		ModelAndView view = new ModelAndView("pengguna/create");
		view.addObject("pengguna", pengguna);
		return view;
	}

}
