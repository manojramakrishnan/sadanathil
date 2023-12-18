package com.sadanathil.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

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
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="Admin_Id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private AdminModel adminModel;
	
	@OneToMany(mappedBy="StudentsModel", cascade=CascadeType.ALL)
	private Set<StudentInfoModel> studentInfoModel= new HashSet<>();
	public Set<StudentInfoModel> getStudentInfoModel(){
		return studentInfoModel;
	}
	
	public void setTeachersModel(Set<StudentInfoModel> studentInfoModel) {
		this.studentInfoModel=studentInfoModel;
		for(StudentInfoModel sm : studentInfoModel ) {
			sm.setStudentsModel(this);
		}
	}

	
}
