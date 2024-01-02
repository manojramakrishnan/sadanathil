package com.sadanathil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadanathil.dao.IStudentsDAO;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.service.IStudentsService;

@Service
public class StudentsServiceImpl implements IStudentsService{

	@Autowired
	IStudentsDAO studentsDAO;
	
	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsDAO.getAllStudents();
	}

	@Override
	public StudentsModel getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentsDAO.getStudentById(id);
	}

}
