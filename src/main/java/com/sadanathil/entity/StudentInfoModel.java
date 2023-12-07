package com.sadanathil.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
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


}
