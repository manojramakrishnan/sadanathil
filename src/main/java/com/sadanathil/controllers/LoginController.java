package com.sadanathil.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadanathil.dto.LoginDto;
import com.sadanathil.entities.AdminModel;
import com.sadanathil.services.IAdminService;
import com.sadanathil.services.IStudentService;
import com.sadanathil.services.ITeacherService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	private IStudentService studentService;
	private ITeacherService teacherService;
	private IAdminService adminService;
	
	public LoginController(IStudentService studentService, ITeacherService teacherService, IAdminService adminService) {
		super();
		this.studentService = studentService;
		this.teacherService = teacherService;
		this.adminService = adminService;
	}

	@GetMapping(value="/getLogin")
	public String  login(Model model, @ModelAttribute("login") LoginDto loginDto) {
		model.addAttribute("login", loginDto);
		return "login";
	}
	
	@PostMapping(value="/postLogin")
	public String login(@ModelAttribute LoginDto loginDto, HttpSession session, HttpServletResponse response) {
		if(loginDto.getRole().equals("admin"))	{
			List<AdminModel> adminList=adminService.getAllAdmins();
			for(AdminModel adminModel: adminList) {
				if(adminModel.getTcNumber().equals(loginDto.getTcNumber()) && adminModel.getPassword().equals(loginDto.getPassword())) {
					session.setAttribute("admin", adminModel);
					return "redirect:/admin/getAdminDashboard";
				}
				
			}
		}
		return "redirect:/login/getLogin";
	
	}
	@GetMapping(value="/Authorization")
	public String getAuthErrorPage() {
		
		return "authErrorPage";
	}
}
