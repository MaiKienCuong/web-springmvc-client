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

import maikiencuong.entity.Lophoc;
import maikiencuong.service.LophocService;

@Controller
@RequestMapping("/lophoc")
public class LophocController {

	@Autowired
	private LophocService lophocService;

	@GetMapping("/list")
	public String findAll(Model model) {
		model.addAttribute("lophocs", lophocService.findAll());
		return "lophoc-list";
	}

	@GetMapping("/add")
	public String showForm(Model model) {
		model.addAttribute("lophoc", new Lophoc());
		return "lophoc-form";
	}

	@GetMapping("/update")
	public String showFormUpdate(Model model, @RequestParam("id") int id) {
		model.addAttribute("lophoc", lophocService.findById(id));
		return "lophoc-form";
	}

	@PostMapping("/save")
	public String save(@Valid @ModelAttribute("lophoc") Lophoc lophoc, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "lophoc-form";
		lophocService.save(lophoc);
		return "redirect:list";
	}

	@GetMapping("delete")
	public String delete(@RequestParam("id") int id) {
		lophocService.delete(id);
		return "redirect:list";
	}

}
