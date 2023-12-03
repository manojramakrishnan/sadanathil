package com.sadanathil.entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class SubjectsModel {

	private Long subjectId;
	private String subjectName;
}
