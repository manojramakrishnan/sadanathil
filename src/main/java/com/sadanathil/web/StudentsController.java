package com.sadanathil.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadanathil.entity.StudentsModel;
import com.sadanathil.service.IStudentInfoService;
import com.sadanathil.service.IStudentsService;

@Controller
@RequestMapping(value="/students")
public class StudentsController {
	
	IStudentsService studentsService;
	IStudentInfoService studentInfoService;
	public StudentsController(IStudentsService studentsService, IStudentInfoService studentInfoService) {
		super();
		this.studentsService = studentsService;
		this.studentInfoService = studentInfoService;
	}

	@GetMapping("/getStudentPage")
	public String showStudent(Model model, HttpServletRequest request, HttpServletResponse response) {
		StudentsModel studentSession=(StudentsModel) request.getSession().getAttribute("student");
		if(studentSession != null) {
			String name = studentSession.getName() +"/" + studentSession.getSurName();
			Cookie cookie1 =new Cookie("UserInfo", String.valueOf(name));
			cookie1.setMaxAge(1*24*60*60);
			cookie1.setSecure(false);
			cookie1.setHttpOnly(false);
			response.addCookie(cookie1);
			Cookie cookie2 =new Cookie("role", String.valueOf("student"));
			cookie2.setMaxAge(1*24*60*60);
			cookie2.setSecure(false);
			cookie2.setHttpOnly(false);
			response.addCookie(cookie2);
			response.setContentType("test/html:charset=UTF-8");
			StudentsModel studentsModel=studentsService.getStudentById(studentSession.getStudentId());
			model.addAttribute("student",studentsModel);
			return "studentShow";
		}
		
		else {
			return "redirect:/login/Authorization";
		}
	}
}
