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
	
}
