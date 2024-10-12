package com.jsp.hibernate_many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_uni.dto.Car;

/**
 * 
 * @author User
 *Sarafraj
 */
public class CarDao {

	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	/**
	 * 
	 * @param car
	 * @return
	 * 
	 * Save insert car method
	 */
	public Car saveCarDao(Car car) {
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		
		return car;
	}
	
	/**
	 * 
	 * @param carId
	 * @return
	 * 
	 * getByCarId 
	 */
	public Car getByCarDao(int carId) {
		
		return entityManager.find(Car.class,carId);
	}
	
	
	/*
	 * Update CarDao method
	 */
	public Car updategetByCarDao(int carId,String carName) {
		
		Car carId1 = getByCarDao(carId);
		
		if(carId1 != null) {
			
			entityTransaction.begin();
			entityManager.merge(carName);
			entityTransaction.commit();
			
			
		}
		return carId1;
		
	}
}
