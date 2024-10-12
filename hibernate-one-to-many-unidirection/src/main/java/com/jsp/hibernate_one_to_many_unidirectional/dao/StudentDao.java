package com.jsp.hibernate_one_to_many_unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction  =entityManager.getTransaction();
	
	/*
	 * save StudentDao
	 */
	public Student saveStudentDao(Student student) {
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		
		return student;
	}
	
	/*
	 * getStudentByIdDao
	 */
	public Student getStudentBYIdDao(int studentId) {
		
	
	 return	entityManager.find(Student.class, studentId);
	
	}
	
   /*
    * Student Delete Method
    */
	
	public boolean deleteStudentByIdDao(int studentId) {
		
		Student student =getStudentBYIdDao(studentId);{
			
			if(student != null) {
				
				entityTransaction.begin();
				entityManager.remove(student);
				entityTransaction.commit();
				
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	/*
	 * updateStudentGetByIdDao
	 */
	public Student updateStudentByIdDao(int studentId,String studentName) {
		
		Student student1 =getStudentBYIdDao(studentId);
		
		if (student1 != null) {
			
			student1.setStudentName(studentName);
			
			entityTransaction.begin();
			entityManager.merge(student1);
			entityTransaction.commit();
			
			return student1;
		} else {

			return null;
		}
	}
	
	/*
	 * displayDao
	 */
	public List<Student> displayAllDao(){
		
		String displayQuery = "from Student";
		
		Query query= entityManager.createQuery(displayQuery);
		
	    return	query.getResultList();
	}
	
}
