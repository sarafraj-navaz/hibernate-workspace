package com.jsp.hibernate_many_to_one_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	@Id
	private int id;
	private String name;
	private String email;
	private long phone;

	
	@ManyToOne
	@JoinColumn(name = "CarID")
	private Car car;
}
