package com.jsp.hibernate_second_time.service;

import java.util.List;

import com.jsp.hibernate_second_time.dao.EmployeeDao;
import com.jsp.hibernate_second_time.dto.Employee;

public class EmployeeService {

	EmployeeDao dao= new EmployeeDao();
	
	
	
	//savemethod of Employee
	public Employee saveMethodEmployeeService(Employee employee) {
	   return dao.saveMethodEmployeeDao(employee);	
	}
	
	//getByempId
	public Employee getByEmpIdService(int empId) {
		return dao.getByEmpIdDao(empId);
	}
	
	//delete employeeId by  getById
	public Employee deleteBygetByempIdService(int empId) {
		return dao.deleteBygetByempIdDao(empId);
	}
	
	//update Method Of the Employee
	public Employee updateNameGetByIdService(int empId,String empName) {
	
		return dao.updateNameGetByIdDao(empId, empName);
	}
	
	//displayAll Data
	public List<Employee> displayAllDataService(){
		List<Employee> employees = dao.displayAllData();
		return employees;
	}
}
