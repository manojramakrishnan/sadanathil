package com.sadanathil.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
@Table(name="teachers")
public class TeachersModel {

	@Column(name="teacher_id")
	private Long teacherId;
	@Column(name="tcNumber")
	private Long tcNumber;
	@Column(name="name")
	private String name;
	@Column(name="surName")
	private String surName;
	@Column(name="phoneNumber")
	private Long phoneNumber;
	@Column(name="mail")
	private String mail;
	@Column(name="gender")
	private boolean gender;
	@Column(name="password")
	private String password;
	@Temporal(TemporalType.DATE)
	private Date recordTime;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="admin_model_id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private AdminModel adminModel;
	
	@ManyToOne(fetch=FetchType.LAZY,optional=false)
	@JoinColumn(name="subject_model_id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private SubjectsModel subjectsModel;
}
