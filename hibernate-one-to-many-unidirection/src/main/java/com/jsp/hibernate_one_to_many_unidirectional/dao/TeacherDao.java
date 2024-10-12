package com.jsp.hibernate_one_to_many_unidirectional.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;

public class TeacherDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	
	StudentDao studentDao = new StudentDao();
	
	
	
	/*
	 * Save Teacher Method
	 */
	public Teacher saveTeacherDao(Teacher teacher) {
		
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
	
	/*
	 * GetTeacherById
	 */
	public Teacher getTeacherByIdDao(int teacherId) {
		
		return entityManager.find(Teacher.class, teacherId);
	}
	
	/*
	 * delete TeacherById
	 */

	public boolean deleteTeacherByIdDao(int teacherId) {
		
		Teacher teacher =getTeacherByIdDao(teacherId);
		
		if(teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			
			return true;
			
		}
		else {
			return false;
		}
	}
	
	/*
	 * update TeacherById Dao
	 */
	public Teacher updateTeacherByIdDao(int teacherId,String teacherName) {
		
		Teacher teacher =getTeacherByIdDao(teacherId);
		
		if(teacher != null) {
			teacher.setTeacherName(teacherName);
			
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			
			return teacher;
		}
		else {
			
			return teacher;
		}
	}
	
	/*
	 * display All Teacher Dao
	 */
	
	public List<Teacher> displayAllTeacherDao(){
		
		String displayQuery ="From Teacher";
		
		Query query =entityManager.createQuery(displayQuery);
		
		return query.getResultList();
	}
	
	
	//update method of the Teacher as will as Student by single method
	
	public Teacher updateConnectTeacherStudentDao(int teacherId,int studentId) {
		
		Student student = studentDao.getStudentBYIdDao(studentId);
		
		Teacher teacher = getTeacherByIdDao(teacherId);
		
		teacher.setStudents(new ArrayList<Student>(Arrays.asList(student)));
        
		
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		
		return teacher;
	}
}
