package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String patientName;
	private String patientEmail;
	
	@ManyToOne
	private Doctor doctor;
	
	public Patient(String patientName, String patientEmail) {
		super();
		this.patientName = patientName;
		this.patientEmail = patientEmail;
	}


}
