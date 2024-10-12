package com.jsp.hibernate_many_to_one_and_one_to_many_bi.service;

import com.jsp.hibernate_many_to_one_and_one_to_many_bi.dao.TeacherDao;
import com.jsp.hibernate_many_to_one_and_one_to_many_bi.dto.Teacher;

public class TeacherService {
	
	
	TeacherDao dao =new TeacherDao();
	
	/*
	 * Insert
	 */
	public Teacher  saveTeacherService(Teacher teacher) {
		
		return dao.saveTeacherDao(teacher);
	}

}
