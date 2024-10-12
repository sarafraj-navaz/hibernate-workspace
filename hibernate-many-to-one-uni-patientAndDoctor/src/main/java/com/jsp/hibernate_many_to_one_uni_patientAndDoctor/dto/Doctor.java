package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	
	
	@Id
	private int doctorId;
	private String doctorName;
	private String doctorEmail;
	private String doctorSpecialist;

}
