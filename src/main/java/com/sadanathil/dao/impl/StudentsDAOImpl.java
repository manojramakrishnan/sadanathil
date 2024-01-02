package com.sadanathil.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sadanathil.dao.IStudentsDAO;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.repository.IStudentsRepository;

@Component
public class StudentsDAOImpl implements IStudentsDAO{

	@Autowired
	IStudentsRepository studentsRepository;
	
	public StudentsDAOImpl(IStudentsRepository studentRepository) {
        this.studentsRepository = studentRepository;
    }
	
	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentsRepository.findAll();
	}

	@Override
	public StudentsModel getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentsRepository.getById(id);
	}

}
