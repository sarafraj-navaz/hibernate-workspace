package com.jsp.hibernate_one_to_many_unidirectional.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@Id
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	private long teacherPhone;
	
	public Teacher(int teacherId, String teacherName, String teacherEmail, long teacherPhone) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
		this.teacherPhone = teacherPhone;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> students;
	
	

}
