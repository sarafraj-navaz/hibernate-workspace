package com.jsp.hibernate_simple_demo_project.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private int productId;
	private String productName;
	private String productColor;
	private double productPrice;

}
