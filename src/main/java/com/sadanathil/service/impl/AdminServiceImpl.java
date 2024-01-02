package com.sadanathil.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadanathil.dao.IAdminDAO;
import com.sadanathil.entity.AdminModel;
import com.sadanathil.service.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	IAdminDAO adminDAO;
	
	@Override
	public List<AdminModel> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminDAO.getAllAdmins();
	}

}
