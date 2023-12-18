package com.sadanathil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InfoCreateDto {

	public int teacherId;
	public int lectureNoteOne;
	public int lectureNoteTwo;
	public int lectureNoteThree;
	public int writeOfAbsence;



}
