package com.jsp.hibernate_many_to_one_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	@Id
	private int carId;
	private String carName;
	private String carColor;
	private double carPrice;

}
