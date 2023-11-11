package com.sadanathil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadanathil.entities.AdminModel;
import com.sadanathil.repositories.IAdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private IAdminRepository adminRepository;
	
	
	public AdminServiceImpl(IAdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}


	@Override
	public List<AdminModel> getAllAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

}
