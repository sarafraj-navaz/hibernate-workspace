package com.jsp.hibernate_many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni.dto.Car;
import com.jsp.hibernate_many_to_one_uni.dto.Person;

public class PersonCarDao {

	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	CarDao carDao =new CarDao();
	
	public Person savePersonCarDao(Person person,int carId) {
		
	     Car car =carDao.getByCarDao(carId);
	     
	     if(car  != null) {
	    	
	    	 person.setCar(car);
	    	 
	    	 entityTransaction.begin();
	    	 entityManager.persist(person);
	    	 entityTransaction.commit();
	    	 return person;
	    	 	
	     }
		return person;
	     
	}
}
