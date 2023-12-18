package com.sadanathil.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TeacherCreateDto {

	private Long tcNumber;
	private String name;
	private String surName;
	private long phoneNumber;
	private String mail;
	private boolean gender;
	private String password;
	private Date recordTime;
	private Long subjectId;
	private Long teacherId;
}
