package com.jsp.hibernate_one_to_many_unidirectional.service;

import java.util.List;

import com.jsp.hibernate_one_to_many_unidirectional.dao.TeacherDao;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;

public class TeacherService {
	
	
	TeacherDao dao = new TeacherDao();
	
	/*
	 * Save Teacher Method
	 */
	public Teacher saveTeacherDao(Teacher teacher) {
		
		return dao.saveTeacherDao(teacher);
	}
	
	/*
	 * GetTeacherById
	 */
	public Teacher getTeacherByIdService(int teacherId) {
		
		return dao.getTeacherByIdDao(teacherId);
	}
	
	/*
	 * delete TeacherById
	 */

	public boolean deleteTeacherByIdService(int teacherId) {
		
		return dao.deleteTeacherByIdDao(teacherId);
	}
	/*
	 * update TeacherById Service
	 */
	public Teacher updateTeacherByIdService(int teacherId,String teacherName) {
		
		return dao.updateTeacherByIdDao(teacherId, teacherName);
	}
	/*
	 * display All Teacher Service
	 */
	
	public List<Teacher> displayAllTeacherDao(){
		
		return dao.displayAllTeacherDao();
	}
	
	
	
	//update method of the Teacher as will as Student by single method
	
	public Teacher updateConnectTeacherStudentDao(int teacherId,int studentId) {
		
	 	return dao.updateConnectTeacherStudentDao(teacherId, studentId);
	}

}
