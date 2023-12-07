package com.sadanathil.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="student")
public class StudentsModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private Long studentId;
	@Column(name="tcnumber")
	private Long tcNumber;
	@Column(name="name")
	private String name;
	@Column(name="sur_name")
	private String surName;
	@Column(name="school_number")
	private Long schoolNumber;
	@Column(name="school_class")
	private Long schoolClass;
	@Column(name="phone_number")
	private Long phoneNumber;
	@Column(name="mail")
	private String mail;
	@Column(name="gender")
	private boolean gender;
	@Column(name="password")
	private String password;
	@Temporal(TemporalType.DATE)
	private Date recordTime;
}
