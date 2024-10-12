package com.jsp.hibernate_many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni.dto.Person;

public class PersonDao {

	
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	/*
	 * Person Dao
	 */
	public Person savePersonDao(Person person) {
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		return person;
	}
}
