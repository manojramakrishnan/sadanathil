package com.sadanathil.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sadanathil.dao.ITeachersDAO;
import com.sadanathil.entity.TeachersModel;
import com.sadanathil.repository.ITeachersRepository;

@Component
public class TeachersDAOImpl implements ITeachersDAO{

	@Autowired
	ITeachersRepository teacherRepository;
	
	public TeachersDAOImpl(ITeachersRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<TeachersModel> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

}
