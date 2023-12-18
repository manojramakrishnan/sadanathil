package com.sadanathil.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadanathil.dto.LoginDto;
import com.sadanathil.service.IAdminService;
import com.sadanathil.service.IStudentsService;
import com.sadanathil.service.ITeachersService;

@Controller
@RequestMapping(value="/login")
public class LoginController {

	IAdminService adminservice;
	IStudentsService studentsService;
	ITeachersService teachersService;
	public LoginController(IAdminService adminservice, IStudentsService studentsService,
			ITeachersService teachersService) {
		super();
		this.adminservice = adminservice;
		this.studentsService = studentsService;
		this.teachersService = teachersService;
	}

	@GetMapping(value="/getLogin")
	public String login(Model model, @ModelAttribute("Login") LoginDto loginDto) {
		model.addAttribute("login",loginDto);
		return "login";
	}
}
