package com.sadanathil.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="studentInfoId")
@Table(name="studentinfo")
public class StudentInfoModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentinfo_id")
	private Long studentInfoId;
	@Column(name="subject_name")
	private String subjectName;
	@Column(name="write_of_absence")
	private String writeOfAbsence;
	@Column(name="lecture_note_one")
	private int lectureNoteOne;
	@Column(name="lecture_note_two")
	private int lecturenoteTwo;
	@Column(name="lecture_note_three")
	private int lectureNoteThree;
	@Column(name="teacher_id")
	private int teacherId;

	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="Students_Model_Id")
	@JsonProperty(access=JsonProperty.Access.WRITE_ONLY)
	private StudentsModel studentsModel;
	

}
