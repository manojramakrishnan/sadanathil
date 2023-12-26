package com.sadanathil.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sadanathil.dao.IStudentsDAO;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.repository.IStudentsRepository;

@Component
public class StudentsDAOImpl implements IStudentsDAO{

	IStudentsRepository studentsRepositroy;
	
	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsRepositroy.findAll();
	}

}
