package com.sadanathil.service;

import java.util.List;

import com.sadanathil.entity.StudentsModel;

public interface IStudentsService {

	List<StudentsModel> getAllStudents();

	StudentsModel getStudentById(Long id);

}
