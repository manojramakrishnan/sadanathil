package com.sadanathil.entity;

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
@Table(name="teacher")
public class TeachersModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacjer_id")
	private Long TeacherId;
	@Column(name="tcnumber")
	private Long tcNumber;
	@Column(name="name")
	private String name;
	@Column(name="sur_name")
	private String surName;
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
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="Admin_Id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private AdminModel adminModel;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="Subjects_Id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private SubjectsModel subjectsModel;

}
