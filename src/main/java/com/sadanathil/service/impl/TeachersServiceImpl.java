package com.sadanathil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadanathil.dao.ITeachersDAO;
import com.sadanathil.entity.TeachersModel;
import com.sadanathil.service.ITeachersService;

@Service
public class TeachersServiceImpl implements ITeachersService{

	@Autowired
	ITeachersDAO teacherDAO;
	
	@Override
	public List<TeachersModel> getAllTeachers() {
		// TODO Auto-generated method stub
		return teacherDAO.getAllTeachers();
	}

	

}
