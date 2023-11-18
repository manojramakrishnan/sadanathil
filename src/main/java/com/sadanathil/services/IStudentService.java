package com.sadanathil.services;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sadanathil.entities.StudentsModel;

public interface IStudentService extends UserDetailsService{

	List<StudentsModel> getAllStudents();

}
