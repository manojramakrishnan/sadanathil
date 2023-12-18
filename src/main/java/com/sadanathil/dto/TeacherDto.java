package com.sadanathil.dto;

import java.util.List;

import com.sadanathil.entity.SubjectsModel;
import com.sadanathil.entity.TeachersModel;

import lombok.Data;

@Data
public class TeacherDto {

	public List<TeachersModel> teachersModel;
	public List<SubjectsModel> subjectsModel;
}
