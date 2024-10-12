package com.jsp.hibernate_many_to_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_many_to_many_uni.dto.Student;
import com.jsp.hibernate_many_to_many_uni.dto.Subject;

public class StudentSubjectDao {
	
	
	EntityManager entityManager =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();

     public  List<Student> saveStudentSubjectsDao(List<Student> students){
		
   
       entityTransaction.begin();
       for (Student student : students) {
    	   entityManager.persist(student);
       }
       entityTransaction.commit();
      	 
       return students;
     }
     
 	/*
 	 * getById
 	 */
 	public Student getAllSubjectByStudentId(int studentId){
 		
 	     return entityManager.find(Student.class, studentId);
 	}
 	
 	public void deleteStudentById(int id) {
 		
 	}
}
