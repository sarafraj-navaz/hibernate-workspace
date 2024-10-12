package com.jsp.hibernate_one_to_one.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adhar {
	
	@Id
	private  Long number;
	private String address;
	private  LocalDate dob;
	private String fathername;

}
