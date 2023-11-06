package com.sadanathil.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="admin")
public class AdminModel {

	private Long adminId;
	private String adminName;
	private String adminEmail;
	private String password;
	private Long tcNumber;
	private String adminPhone;
	private String adminAddress;
	private String adminGender;
	private Date recordTime;
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
