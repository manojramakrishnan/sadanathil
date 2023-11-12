package com.sadanathil.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="subjects")
public class SubjectsModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long subjectId;
	@Column(name="subject_name")
	private String subjectName;

	@OneToMany(mappedBy = "subjectsModel", cascade = CascadeType.ALL)
	private Set<TeachersModel> teacher = new HashSet<>();
	
	public Set<TeachersModel> getTeachersModel(){
		return teacher;
		
	}
	
	public void setTeachersModel(Set<TeachersModel> teacher) {
		this.teacher=teacher;
			for(TeachersModel b : teacher) {
				
				b.setSubjectsModel(this);
			}
		
	}

}
