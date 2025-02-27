package com.jsp.hibernate_one_to_many_university_collage_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class University {

	@Id
	private int universityId;
	private String universityName;
	private String universityaddress;

	@OneToMany
	private List<Collage> collages;
	

	public University(int universityId, String universityName, String universityaddress) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.universityaddress = universityaddress;
	}

	@Override
	public String toString() {
		return "University Id====:" + universityId + " University Name====:  " + universityName
				+ "University Address===: " + universityaddress;
	}

}
