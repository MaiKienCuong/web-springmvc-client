package maikiencuong.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import maikiencuong.entity.Sinhvien;
import maikiencuong.service.LophocService;
import maikiencuong.service.SinhvienService;

@Controller
@RequestMapping("/sinhvien")
public class SinhvienController {

	@Autowired
	private SinhvienService sinhvienService;

	@Autowired
	private LophocService lophocService;

	@GetMapping("/list")
	public String findAll(Model model,
			@RequestParam(value = "idLophoc", required = false, defaultValue = "0") int idLophoc) {
		model.addAttribute("sinhviens", sinhvienService.findAll(idLophoc));
		return "sinhvien-list";
	}

	@GetMapping("/add")
	public String showForm(Model model, @RequestParam("idLophoc") int idLophoc) {
		Sinhvien sinhvien = new Sinhvien();
		sinhvien.setLophoc(lophocService.findById(idLophoc));
		model.addAttribute("sinhvien", sinhvien);
		return "sinhvien-form";
	}

	@GetMapping("/update")
	public String showFormUpdate(Model model, @RequestParam("id") int id) {
		model.addAttribute("sinhvien", sinhvienService.findById(id));
		return "sinhvien-form";
	}

	@PostMapping("/save")
	public String save(@Valid @ModelAttribute("sinhvien") Sinhvien sinhvien, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "sinhvien-form";
		sinhvienService.save(sinhvien);
		return "redirect:list";
	}

	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		sinhvienService.delete(id);
		return "redirect:list";
	}

}
