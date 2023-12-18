package com.sadanathil.dto;

import java.util.List;

import com.sadanathil.entity.SubjectsModel;
import com.sadanathil.entity.TeachersModel;

import lombok.Data;

@Data
public class TeacherUpdateDto {

	public TeachersModel teachersModel;
	public List<SubjectsModel> subjectsModel;
}
