package com.sadanathil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	public HomeController() {
		
	}
	public String index(Model model) {
		model.addAttribute("index", model);
		return "index";
	}

}
