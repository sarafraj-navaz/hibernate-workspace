package com.jsp.hibernate_one_to_many_unidirectional.service;

import java.util.List;

import com.jsp.hibernate_one_to_many_unidirectional.dao.TeacherStudentDao;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;

public class TeacherStudentService {
	
	
	
	TeacherStudentDao  dao = new TeacherStudentDao();
	/*
	 * save TeacherStudent Service
	 */
	public Teacher saveTeacherService(Teacher teacher,List<Student> students) {
		
		return dao.saveTeacherDao(teacher, students);
	}

}
