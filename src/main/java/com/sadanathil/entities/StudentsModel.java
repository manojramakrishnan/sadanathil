package com.sadanathil.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
@Table(name="students")
public class StudentsModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private Long studentId;
	@Column(name="tcNumber")
	private Long tcNumber;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surName;
	@Column(name="schoolNumber")
	private Long schoolNumber;
	@Column(name="schoolClass")
	private Long schoolClass;
	@Column(name="phoneNumber")
	private Long phoneNumber;
	@Column(name="mail")
	private String mail;
	@Column(name="gender")
	private boolean gender;
	@Column(name="password")
	private String password;
	@Column(name="record_time")
	@Temporal(TemporalType.DATE)
	private Date recordTime;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="admin_model_id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private AdminModel adminModel;

	public StudentsModel() {
		
	}
	
	public StudentsModel(Long tcNumber, String name, String surName, Long schoolNumber, Long schoolClass,
			Long phoneNumber, String mail, boolean gender, String password, Date recordTime) {
		super();
		this.tcNumber = tcNumber;
		this.name = name;
		this.surName = surName;
		this.schoolNumber = schoolNumber;
		this.schoolClass = schoolClass;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.gender = gender;
		this.password = password;
		this.recordTime = recordTime;
	}
	
}
