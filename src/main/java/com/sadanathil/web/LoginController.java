package com.sadanathil.web;

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
import com.sadanathil.entity.AdminModel;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.entity.TeachersModel;
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
	
	@PostMapping(value="/postLogin")
	public String login(@ModelAttribute LoginDto loginDto, HttpSession session, HttpServletResponse response) {
		if(loginDto.getRole().equals("students")) {
			List<StudentsModel> studentList= studentsService.getAllStudents();
			for(StudentsModel studentsModel : studentList) {
				if(studentsModel.getTcNumber().equals(loginDto.getTcNo()) && (studentsModel.getPassword().equals(loginDto.getPassword()))) {
					session.setAttribute("student", studentsModel);
					return "redirect:/student/getStudentPage";
				}
			}
		}
		else if(loginDto.getRole().equals("teachers")) {
			List<TeachersModel> teacherList= teachersService.getAllTeachers();
			for(TeachersModel teachersModel : teacherList) {
				if(teachersModel.getTcNumber().equals(loginDto.getTcNo()) && (teachersModel.getPassword().equals(loginDto.getPassword()))) {
					session.setAttribute("teacher", teachersModel);
					return "redirect:/teacher/getTeacherPage";
				}
			}
		}
		else if(loginDto.getRole().equals("admin")) {
			List<AdminModel> adminList= adminservice.getAllAdmins();
			for(AdminModel adminModel : adminList) {
				if(adminModel.getTcNumber().equals(loginDto.getTcNo()) && (adminModel.getAdminPassword().equals(loginDto.getPassword()))) {
					session.setAttribute("admin", adminModel);
					return "redirect:/admin/getAdminPage";
				}
			}
		}
		return "redirect:/login/getLogin";
	}
}
