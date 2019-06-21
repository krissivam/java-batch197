package com.xsis.batch197.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.xsis.batch197.model.XBiodataAttachmentModel;
import com.xsis.batch197.model.XBiodataModel;
import com.xsis.batch197.model.XKeahlianModel;
import com.xsis.batch197.model.XRiwayatPekerjaanModel;
import com.xsis.batch197.model.XRiwayatPelatihanModel;
import com.xsis.batch197.model.XRiwayatPendidikanModel;
import com.xsis.batch197.model.XSertifikasiModel;
import com.xsis.batch197.repository.XBiodataAttachmentRepo;
import com.xsis.batch197.repository.XBiodataRepo;
import com.xsis.batch197.repository.XKeahlianRepo;
import com.xsis.batch197.repository.XRiwayatPekerjaanRepo;
import com.xsis.batch197.repository.XRiwayatPelatihanRepo;
import com.xsis.batch197.repository.XRiwayatPendidikanRepo;
import com.xsis.batch197.repository.XSertifikasiRepo;

@Controller
@RequestMapping(value = "/pelamar")
public class PelamarController {

	@Autowired
	private XBiodataRepo repoBio;
	
	@Autowired
	private XRiwayatPendidikanRepo repoRiwpend;
	
	@Autowired 
	private XRiwayatPekerjaanRepo repoRiwpek;
	
	@Autowired
	private XKeahlianRepo repoKeahlian;
	
	@Autowired
	private XRiwayatPelatihanRepo repoRiwpel;
	
	@Autowired
	private XSertifikasiRepo repoSer;
	
	@Autowired
	private XBiodataAttachmentRepo repoBioaat;

	@GetMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("pelamar/index");
		return view;
	}

	// Method Button Add
	@GetMapping(value = "/add")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("pelamar/create");
		XBiodataModel pelamar = new XBiodataModel();
		view.addObject("pelamar", pelamar);
		return view;
	}

	// Method List data saat load pelamar/index
	@GetMapping(value = "/list")
	public ModelAndView list() {
		ModelAndView view = new ModelAndView("pelamar/list");
		List<XBiodataModel> listPelamar = repoBio.findAll();
		view.addObject("list", listPelamar);
		return view;
	}

	// Method untuk button search
	@GetMapping(value = "/list/{key}")
	public ModelAndView list(@PathVariable("key") String key) {
		ModelAndView view = new ModelAndView("pelamar/list");
		// load data provinsi via repo, disimpan kedalam list
		List<XBiodataModel> listPelamar = repoBio.search(key);
		// lemparkan data ke view, list object baru
		view.addObject("list", listPelamar);
		return view;
	}
	
	//Method untuk menampilkan isi modal pelamar
	@GetMapping(value = "/detail/{id}")
	public ModelAndView detail(@PathVariable("id") Long id) {
		// buat object view
		ModelAndView view = new ModelAndView("pelamar/detail");
		// mengambil data dahulu dari database via repository
		XBiodataModel pelamar = repoBio.findById(id).orElse(new XBiodataModel());
		view.addObject("pelamar", pelamar);
		List<XRiwayatPendidikanModel> listPend = repoRiwpend.findAll();
		view.addObject("listPend", listPend);
		List<XRiwayatPekerjaanModel> listPek = repoRiwpek.findAll();
		view.addObject("listPek", listPek);
		List<XKeahlianModel> listKeahlian = repoKeahlian.findAll();
		view.addObject("listKeahlian", listKeahlian);
		List<XRiwayatPelatihanModel> listPel = repoRiwpel.findAll();
		view.addObject("listPel", listPel);
		List<XSertifikasiModel> listSer = repoSer.findAll();
		view.addObject("listSer", listSer);
		List<XBiodataAttachmentModel> listBioatt = repoBioaat.findAll();
		view.addObject("listBioatt", listBioatt);
		return view;
	}

}
