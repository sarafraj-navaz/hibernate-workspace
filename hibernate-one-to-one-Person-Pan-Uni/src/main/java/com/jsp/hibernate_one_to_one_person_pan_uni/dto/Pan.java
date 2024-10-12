package com.jsp.hibernate_one_to_one_person_pan_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pan {
	@Id
	private int panNumber;
	private String address;
	private String fatherName;
	
	@Override
	public String toString() {
		return "Pan [panNumber=" + panNumber + ", address=" + address + ", fatherName=" + fatherName + "]";
	}
	

	
	

}
