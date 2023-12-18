package com.sadanathil.entity;

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
@Table(name="subject")
public class SubjectsModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id")
	private Long subjectId;
	@Column(name="subject_name")
	private String subjectName;
	
	@OneToMany(mappedBy="SubjectsModel", cascade=CascadeType.ALL)
	private Set<TeachersModel> teachersModel= new HashSet<>();
	public Set<TeachersModel> getTeachersModel(){
		return teachersModel;
	}
	
	public void setTeachersModel(Set<TeachersModel> teachersModel) {
		this.teachersModel=teachersModel;
		for(TeachersModel sm : teachersModel ) {
			sm.setSubjectsModel(this);
		}
	}
}
