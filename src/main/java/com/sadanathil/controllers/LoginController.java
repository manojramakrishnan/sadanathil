package com.sadanathil.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sadanathil.dto.LoginDto;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String  getLoginPage(@ModelAttribute("login") LoginDto loginDto) {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("login") LoginDto loginDto, HttpSession session, HttpServletResponse response) {
		if(loginDto.getRole())
	}

	
}
