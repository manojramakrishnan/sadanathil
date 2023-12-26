package com.sadanathil.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.sadanathil.dao.IAdminDAO;
import com.sadanathil.entity.AdminModel;
import com.sadanathil.repository.IAdminRepository;

@Component
public class AdminDAOImpl implements IAdminDAO {

	IAdminRepository adminRepository;
	
	@Override
	public List<AdminModel> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
