package com.jsp.hibernate_many_to_one_and_one_to_many_bi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentNumber;

	@ManyToOne
	private Teacher teacher;
}
