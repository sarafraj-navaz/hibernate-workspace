package com.jsp.hibernate_many_to_many_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
	private int id;
	private String name;
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	List<Subject> subjects;

}
