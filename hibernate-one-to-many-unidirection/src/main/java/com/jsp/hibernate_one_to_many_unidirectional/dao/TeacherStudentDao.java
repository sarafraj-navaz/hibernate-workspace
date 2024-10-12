package com.jsp.hibernate_one_to_many_unidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;

public class TeacherStudentDao {
	
	
     StudentDao studentDao = new StudentDao();
     TeacherDao teacherDao = new TeacherDao();
	
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	/*
	 * save TeacherStudent Dao
	 */
	public Teacher saveTeacherDao(Teacher teacher,List<Student> students) {
		
		entityTransaction.begin();
		teacher.setStudents(students);
		
		entityManager.persist(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
	

}
