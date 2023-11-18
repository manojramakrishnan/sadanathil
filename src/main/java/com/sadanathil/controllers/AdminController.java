package com.sadanathil.controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadanathil.entities.AdminModel;
import com.sadanathil.entities.StudentsModel;
import com.sadanathil.services.IStudentService;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@Autowired
	private IStudentService studentService;

	public AdminController(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	public AdminController() {
		
	}
	
	@GetMapping(value="/getAdminDashboard")
	public String getAdminDashboard(Model model,HttpServletResponse response, HttpServletRequest request) {
		try {
			AdminModel sessionAdmin= (AdminModel) request.getSession().getAttribute("admin"); 
			if (sessionAdmin != null) {
				Cookie adminCookie = new Cookie("UserInfo",sessionAdmin.getAdminName());
				adminCookie.setMaxAge(1*24*60*60);
				adminCookie.setSecure(false);
				adminCookie.setHttpOnly(false);
				response.addCookie(adminCookie);
				
				Cookie adminNewCookie = new Cookie("Role","Admin");
				adminNewCookie.setMaxAge(1*24*60*60);
				adminNewCookie.setSecure(false);
				adminNewCookie.setHttpOnly(false);
				response.addCookie(adminNewCookie);
				
				List<StudentsModel> studentsList= studentService.getAllStudents();
				model.addAttribute("studentsList",studentsList);
				return "adminStudentCreate";
				
			}
			else {
				return "redirect:/login/Authorization";

			}
		}
		catch(Exception e) {
			return "redirect:/admin/getAdminDashboard";
		}
	}
}
