package com.sadanathil.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sadanathil.entities.StudentsModel;
import com.sadanathil.repositories.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService{
    
	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

	@Override
	public List<StudentsModel> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
}
