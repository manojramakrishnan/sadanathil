package com.sadanathil.entities;

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

import lombok.Data;

@Entity
@Data
@Table(name="admin")
public class AdminModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private Long adminId;
	@Column(name="admin_Name")
	private String adminName;
	@Column(name="admin_email")
	private String adminEmail;
	@Column(name="password")
	private String password;
	@Column(name="tcNumber")
	private Long tcNumber;
	@Column(name="admin_phone")
	private String adminPhone;
	@Column(name="admin_address")
	private String adminAddress;
	@Column(name="admin_gender")
	private String adminGender;
	private Date recordTime;
	
	@OneToMany(mappedBy="adminModel",cascade=CascadeType.ALL)	
	private Set<StudentsModel> studentsModels=new HashSet<>();
	
	public Set<StudentsModel> getStudentsModels(){
		return studentsModels;
		
	}
	public void setStudentsModel(Set<StudentsModel> studentsModels) {
		this.studentsModels=studentsModels;
		for(StudentsModel b : studentsModels) {
			b.setAdminModel(this);
		}
	}
	
	@OneToMany(mappedBy="adminModel",cascade=CascadeType.ALL)
	private Set<TeachersModel> teachersModels=new HashSet<>();
	
	public Set<TeachersModel> getTeachersModels(){
		return teachersModels;
		
	}
	public void setTeachersModel(Set<TeachersModel> teachersModels) {
		this.teachersModels=teachersModels;
		for(TeachersModel b : teachersModels) {
			b.setAdminModel(this);
		}
	}
	
	
}
