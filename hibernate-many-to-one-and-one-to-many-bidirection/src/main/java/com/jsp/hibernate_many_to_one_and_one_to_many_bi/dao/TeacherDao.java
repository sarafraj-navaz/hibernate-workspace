package com.jsp.hibernate_many_to_one_and_one_to_many_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_one_and_one_to_many_bi.dto.Teacher;

public class TeacherDao {

	EntityManager entityManager =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	
	/*
	 * Insert
	 */
	public Teacher  saveTeacherDao(Teacher teacher) {
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
}
