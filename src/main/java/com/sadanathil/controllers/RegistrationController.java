package com.sadanathil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sadanathil.dto.RegistrationDto;
import com.sadanathil.services.IRegistrationService;

@Controller
public class RegistrationController {
	
	private IRegistrationService registrationService;
	
	public RegistrationController(IRegistrationService registrationService) {
		super();
		this.registrationService = registrationService;
	}

	@GetMapping("/registration")
	public String getRegistrationPage(@ModelAttribute("user") RegistrationDto registrationDto) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user") RegistrationDto registrationDto,Model model) {
		registrationService.save(registrationDto);
		model.addAttribute("message","registered successfully" );
		return "register";
	}

}
