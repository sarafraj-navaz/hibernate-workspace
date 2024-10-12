package com.jsp.hibernate_many_to_one_and_one_to_many_bi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	
	@Id
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	private long teacherNumber;
	
	@OneToMany(mappedBy ="teacher")
	private List<Student> students;
	
	
	
	
	

}
