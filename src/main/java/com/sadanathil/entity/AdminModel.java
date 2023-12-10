package com.sadanathil.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="admin")
public class AdminModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private Long adminId;
	@Column(name="admin_name")
	private String adminName;
	@Column(name="admin_email")
	private String adminEmail;
	@Column(name="admin_password")
	private String adminPassword;
	@Column(name="tcnumber")
	private Long tcNumber;
	@Column(name="admin_phone")
	private String adminPhone;
	@Column(name="admin_address")
	private String adminAddress;
	@Column(name="admin_gender")
	private String adminGender;
	@Temporal(TemporalType.DATE)
	private Date recordTime;
	
	@OneToMany(mappedBy="AdminModel", cascade=CascadeType.ALL)
	private Set<StudentsModel> studentsModel= new HashSet<>();
	public Set<StudentsModel> getStudentsModels(){
		return studentsModel;
	}
	
	public void setStudentsModel(Set<StudentsModel> studentsModels) {
		this.studentsModel=studentsModels;
		for(StudentsModel sm : studentsModels ) {
			sm.setAdminModel(this);
		}
	}
	
	@OneToMany(mappedBy="AdminModel", cascade=CascadeType.ALL)
	private Set<TeachersModel> teachersModel= new HashSet<>();
	public Set<TeachersModel> getTeachersModels(){
		return teachersModel;
	}
	
	public void setTeachersModel(Set<TeachersModel> teachersModels) {
		this.teachersModel=teachersModels;
		for(TeachersModel sm : teachersModels ) {
			sm.setAdminModel(this);
		}
	}
	
}
