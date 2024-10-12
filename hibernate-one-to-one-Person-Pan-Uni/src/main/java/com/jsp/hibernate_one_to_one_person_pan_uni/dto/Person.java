package com.jsp.hibernate_one_to_one_person_pan_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {
	@Id
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	private int personId;
	private String personName;
	private String personEmail;

	@OneToOne
	private Pan pan;

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personEmail=" + personEmail + ", pan="
				+ pan + "]";
	}

	/*
	 * @Override public int compareTo(Person p) { return this.personId - p.personId;
	 * }
	 */

	 @Override 
	public int compareTo(Person p) {
		return (int) this.personName.compareTo(p.personName);
	}

}
