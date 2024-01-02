package com.sadanathil.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sadanathil.dao.IAdminDAO;
import com.sadanathil.entity.AdminModel;
import com.sadanathil.repository.IAdminRepository;

@Component
public class AdminDAOImpl implements IAdminDAO {

	@Autowired
	IAdminRepository adminRepository;
	
	public AdminDAOImpl(IAdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public List<AdminModel> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
