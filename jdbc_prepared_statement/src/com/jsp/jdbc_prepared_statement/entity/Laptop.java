package com.jsp.jdbc_prepared_statement.entity;

/**
 * 
 * @author Sarafraj navaz
 * 
 * 
 * i have created this bean class
 * 
 * 
 *
 */

public class Laptop {
	
	private int laptopId;
	private String laptopName;
	private String  laptopColor;
	private double laptopPrice;
	private String laptopRam;
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopName() {
		return laptopName;
	}
	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	public String getLaptopColor() {
		return laptopColor;
	}
	public void setLaptopColor(String laptopColor) {
		this.laptopColor = laptopColor;
	}
	public double getLaptopPrice() {
		return laptopPrice;
	}
	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	public String getLaptopRam() {
		return laptopRam;
	}
	public void setLaptopRam(String laptopRam) {
		this.laptopRam = laptopRam;
	}
	
	public Laptop() {
	}
	
	public Laptop(int laptopId, String laptopName, String laptopColor, double laptopPrice, String laptopRam) {
		this();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopColor = laptopColor;
		this.laptopPrice = laptopPrice;
		this.laptopRam = laptopRam;
	}
	
	
	

}
