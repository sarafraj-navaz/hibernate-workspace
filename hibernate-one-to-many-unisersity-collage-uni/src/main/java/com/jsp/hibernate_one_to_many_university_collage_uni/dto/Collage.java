package com.jsp.hibernate_one_to_many_university_collage_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Collage {
	
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Id
	private int collageId;
	private String collageName;
	private String collageAddress;
	private String collageType;
	public Collage(String collageName, String collageAddress, String collageType) {
		super();
		this.collageName = collageName;
		this.collageAddress = collageAddress;
		this.collageType = collageType;
	}
	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", collageAddress=" + collageAddress
				+ ", collageType=" + collageType + "]";
	}
	

}
