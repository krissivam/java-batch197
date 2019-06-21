package com.xsis.batch197.controller;

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

import com.xsis.batch197.model.XBiodataAttachmentModel;
import com.xsis.batch197.repository.XBiodataAttachmentRepo;

@Controller
@RequestMapping(value = "/dokumen")
public class DokumenController {
	private static final Logger Logger = LoggerFactory.getLogger(DokumenController.class);
	//untuk mengambil data dr database
	@Autowired
	private XBiodataAttachmentRepo repo;

	@GetMapping(value = "/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("dokumen/index");
		return view;
	}


	@GetMapping(value = "/list")
	public ModelAndView list() {
		ModelAndView view = new ModelAndView("dokumen/list");
		// load data dokumen via repo, disimpan kedalam list
		List<XBiodataAttachmentModel> listdokumen = repo.findAll();
		// lemparkan data ke view, list object baru, datanya listdokumen
		view.addObject("list", listdokumen);

		return view;
	}
	
	@GetMapping(value = "/add")
	public ModelAndView create() {
		ModelAndView view = new ModelAndView("dokumen/create");
		// membuat object dokumen yg akan dikirim ke view
		// object dokumen adalah new object dari dokumenModel
		XBiodataAttachmentModel dokumen = new XBiodataAttachmentModel();
		
		view.addObject("dokumen", dokumen);
		return view;

	}

	@GetMapping(value = "/testing")
	public ModelAndView testing() {
		ModelAndView view = new ModelAndView("dokumen/testing");
		return view;

	}

	
	// #3. Menangkap data dari form
		@PostMapping(value = "/save")
		public ModelAndView save(@Valid @ModelAttribute("dokumen") 	XBiodataAttachmentModel dokumen, BindingResult result) {
			Logger.error("--"+dokumen.getIsDeleted());
			if (result.hasErrors()) {
				Logger.info("save dokumen error");
			}else {
				repo.save(dokumen);
			}
			
			ModelAndView view = new ModelAndView("dokumen/create");
			view.addObject("dokumen", dokumen);
			return view;
		}
		
		// #2. Membuat Form Add dokumen
		@GetMapping(value = "/edit/{id}")
		public ModelAndView edit(@PathVariable("id") Long id) {
			// buat object view
			ModelAndView view = new ModelAndView("dokumen/update");
			// mengambil data dahulu dari database via repository
			XBiodataAttachmentModel dokumen = repo.findById(id).orElse(new XBiodataAttachmentModel());
			// membuat object dokumen yg akan dikirim ke view
			// object dokumen adalah new object dari dokumenModel
			view.addObject("dokumen", dokumen);
			return view;
		}
		// #3. Menangkap data dari form
		@PostMapping(value = "/update")
		public ModelAndView update(@Valid @ModelAttribute("dokumen") XBiodataAttachmentModel dokumen, BindingResult result) {
			if (result.hasErrors()) {
				Logger.info("save dokumen error");
			}else {
				repo.save(dokumen);
			}
			
			ModelAndView view = new ModelAndView("dokumen/update");
			view.addObject("dokumen", dokumen);
			return view;
		}
		
		// #4. Membuat Form Add provinsi
		@GetMapping(value = "/delete/{id}")
		public ModelAndView delete(@PathVariable("id") Long id) {
			// buat object view
			ModelAndView view = new ModelAndView("dokumen/delete");
			// mengambil data dahulu dari database via repository
			XBiodataAttachmentModel dokumen = repo.findById(id).orElse(new XBiodataAttachmentModel());
			// membuat object dokumen yg akan dikirim ke view
			// object dokumen adalah new object dari dokumenModel
			view.addObject("dokumen", dokumen);
			return view;
		}
		
		// #3. Menangkap data dari form
		@PostMapping(value = "/remove")
		public ModelAndView remove(@ModelAttribute("dokumen") XBiodataAttachmentModel dokumen) {
			// remove data dari database via repo
			repo.delete(dokumen);
			// membuat object view
			ModelAndView view = new ModelAndView("dokumen/delete");
			view.addObject("dokumen", dokumen);
			// redirect to index
			return view;
		}
}
