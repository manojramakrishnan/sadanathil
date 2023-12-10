package com.sadanathil.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sadanathil.entity.StudentsModel;
import com.sadanathil.service.IAdminService;
import com.sadanathil.service.IStudentInfoService;
import com.sadanathil.service.IStudentsService;
import com.sadanathil.service.ISubjectsService;
import com.sadanathil.service.ITeachersService;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	IAdminService adminservice;
	IStudentInfoService studentInfoService;
	IStudentsService studentsService;
	ISubjectsService subjectsService;
	ITeachersService teachersService;
	
	public AdminController(IAdminService adminservice, IStudentInfoService studentInfoService,
			IStudentsService studentsService, ISubjectsService subjectsService, ITeachersService teachersService) {
		super();
		this.adminservice = adminservice;
		this.studentInfoService = studentInfoService;
		this.studentsService = studentsService;
		this.subjectsService = subjectsService;
		this.teachersService = teachersService;
	}

	private static StudentsModel studentsModel;
}
