package com.jsp.hibernate_second_time.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_second_time.dto.Employee;

public class EmployeeDao {

	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	//savemethod of Employee
	public Employee saveMethodEmployeeDao(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
	    entityTransaction.commit();
	    
	    return employee;
	}
	
	//getByempId
	public Employee getByEmpIdDao(int empId) {
	  return entityManager.find(Employee.class, empId);
	}
	
	//delete employeeId by  getById
	public Employee deleteBygetByempIdDao(int empId) {
		Employee employee= getByEmpIdDao(empId);
		
		if(employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			
			return employee;
		}
		return null;
	}
	
	//update Method Of the Employee
	public Employee updateNameGetByIdDao(int empId,String empName) {
		Employee employee1= getByEmpIdDao(empId);
		
		if(employee1 != null) {
			employee1.setEmployeeName(empName);
			
			entityTransaction.begin();
			entityManager.merge(employee1);
			entityTransaction.commit();
			
			return employee1;
		}
	   return null;
	}
	
	//displayAll Data
	public List<Employee> displayAllData(){
		 String displayQuery ="SELECT s FROM Employee s"; 
          Query query= entityManager.createQuery(displayQuery);
          
          return query.getResultList();
		/*
		 * Scanner scanner =new Scanner(System.in);
		 * System.out.println("enter  the name to display"); String name
		 * =scanner.next();
		 * 
		 * String displayQuery
		 * ="SELECT emp FROM Employee emp WHERE emp.employeeName=:1"; Query query=
		 * entityManager.createQuery(displayQuery); query.setParameter(1, name);
		 * 
		 * Employee employee=(Employee)query.getSingleResult();
		 * System.out.println(employee);
		 */
	}
}
