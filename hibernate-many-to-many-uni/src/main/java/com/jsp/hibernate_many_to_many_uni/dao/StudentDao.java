package com.jsp.hibernate_many_to_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_many_uni.dto.Student;

public class StudentDao {
	
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	
	public Student saveStudentDao(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	


}
