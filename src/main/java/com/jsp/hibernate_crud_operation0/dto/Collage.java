package com.jsp.hibernate_crud_operation0.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collage {
	@Id
	private int id;
	private String name;
	private String address;
	private long pincode;
	@Override
	public String toString() {
		return "Collage [id=" + id + ", name=" + name + ", address=" + address + ", pincode=" + pincode + "]";
	}
	
	

}
