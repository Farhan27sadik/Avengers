package com.farhan.avengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.farhan.avengers.model.Avengers;
import com.farhan.avengers.service.AvengersCatalogService;

@Controller
public class AvengersCatalogController {

	AvengersCatalogService avengersCatalogService;

	public AvengersCatalogController(AvengersCatalogService avengersCatalogService) {
		this.avengersCatalogService = avengersCatalogService;
	}

	@GetMapping("/")
	public ModelAndView getAllAvengers() {
		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("avengerslist", this.avengersCatalogService.getAllAvengers());

		return modelAndView;
	}

	@GetMapping("/showNewAvengerForm")
	public String showNewAvengerForm(Model model) {
		Avengers avenger = new Avengers();
		model.addAttribute("avenger", avenger);
		return "addAvenger";
	}

	@PostMapping("/saveAvenger")
	public ModelAndView addAvenger(@ModelAttribute Avengers avenger) {
		System.out.println(avenger);
		avengersCatalogService.addAvengers(avenger);

		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("avengerslist", this.avengersCatalogService.getAllAvengers());

		return modelAndView;

	}

	@GetMapping("/updateAvenger/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int id, Model model) {
		Avengers avenger = avengersCatalogService.getAvengerById(id);
		model.addAttribute("avenger", avenger);
		return "updateAvenger";
	}

	@PostMapping("/updateAvenger/{id}")
	public ModelAndView updateAvenger(@PathVariable(value = "id") int id,
			@ModelAttribute("avenger") Avengers avenger) {
		avengersCatalogService.updateAvenger(avenger,id);
		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("avengerslist", this.avengersCatalogService.getAllAvengers());

		return modelAndView;
	}

	@GetMapping("/deleteAvenger/{id}")
	public ModelAndView deleteAvengers(@PathVariable(value = "id") int id, Model model) {
		avengersCatalogService.deleteAvengers(id);
		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("avengerslist", this.avengersCatalogService.getAllAvengers());

		return modelAndView;
}
}
