package com.jsp.hibernate_one_to_one.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	
    @JoinColumn(name = "adharNumber")
    @OneToOne
	private  Adhar adhar;
	
	
}
