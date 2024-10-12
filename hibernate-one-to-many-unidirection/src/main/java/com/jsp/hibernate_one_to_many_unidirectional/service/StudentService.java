package com.jsp.hibernate_one_to_many_unidirectional.service;

import java.util.List;

import com.jsp.hibernate_one_to_many_unidirectional.dao.StudentDao;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;

public class StudentService {
	
	
	
	StudentDao dao = new StudentDao();
	/*
	 * save StudentDao
	 */
	public Student saveStudentDao(Student student) {
		
		return dao.saveStudentDao(student);
	}
   
	/*
	 * getStudentByIdDao
	 */
	public Student getStudentBYIdService(int studentId) {
		
		return dao.getStudentBYIdDao(studentId);
	}
	
	   /*
	    * Student Delete Method
	    */
		
		public boolean deleteStudentByIdService(int studentId) {
			
			return dao.deleteStudentByIdDao(studentId);
			
		}
		
		/*
		 * updateStudentGetByIdDao
		 */
		public Student updateStudentByIdDao(int studentId,String studentName) {
			
			return dao.updateStudentByIdDao(studentId, studentName);
		}
		
		/*
		 * displayDao
		 */
		public List<Student> displayAllService(){
			
			return dao.displayAllDao();
		}
}
