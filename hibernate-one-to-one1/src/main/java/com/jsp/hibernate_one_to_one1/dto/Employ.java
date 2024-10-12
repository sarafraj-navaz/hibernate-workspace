package com.jsp.hibernate_one_to_one1.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employ {
	
	@Id
	private int employeeId;
	private String employeeName;
	private String employEmail;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "laptopForeign")
	private Laptop laptop;

}
