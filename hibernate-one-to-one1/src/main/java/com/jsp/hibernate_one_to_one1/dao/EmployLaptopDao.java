package com.jsp.hibernate_one_to_one1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_one1.dto.Employ;

public class EmployLaptopDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =  entityManager.getTransaction();
	
	//Save Method
	public Employ saveEmployPersonDao(Employ employ) {
		
		entityTransaction.begin();
		entityManager.persist(employ);
		entityTransaction.commit();
		
		return employ;
	}
	//get by Id method
	public Employ getByEmployIdDao(int employId) {
		return entityManager.find(Employ.class,employId);
	}

}
