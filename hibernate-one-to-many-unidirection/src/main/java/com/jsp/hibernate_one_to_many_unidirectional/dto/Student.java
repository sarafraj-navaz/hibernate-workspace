package com.jsp.hibernate_one_to_many_unidirectional.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhone;

}
