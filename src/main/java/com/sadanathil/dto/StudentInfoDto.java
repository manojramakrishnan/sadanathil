package com.sadanathil.dto;

import java.util.List;

import com.sadanathil.entity.StudentInfoModel;
import com.sadanathil.entity.StudentsModel;
import com.sadanathil.entity.TeachersModel;

import lombok.Data;

@Data
public class StudentInfoDto {

	public List<StudentsModel> studentsList;
	public List<TeachersModel> teachersList;
	public List<StudentInfoModel> studentInfoModel;
	
}
