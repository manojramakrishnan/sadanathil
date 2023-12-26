package com.sadanathil.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sadanathil.dao.IStudentsDAO;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.service.IStudentsService;

@Service
public class StudentsServiceImpl implements IStudentsService{

	IStudentsDAO studentsDAO;
	
	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsDAO.getAllStudents();
	}

}
