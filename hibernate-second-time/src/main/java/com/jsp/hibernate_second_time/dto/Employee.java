package com.jsp.hibernate_second_time.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private double employeeSal;
	private long employPhone;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeSal=" + employeeSal + ", employPhone=" + employPhone + "]";
	}
	
}
