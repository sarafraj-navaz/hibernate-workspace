package com.jsp.hibernate_one_to_one1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
	
	@Id
	private int laptopQuality;
	private String laptopName;
	

}
