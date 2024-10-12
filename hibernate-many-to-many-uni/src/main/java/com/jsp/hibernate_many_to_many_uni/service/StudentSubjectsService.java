package com.jsp.hibernate_many_to_many_uni.service;

import java.util.List;

import com.jsp.hibernate_many_to_many_uni.dao.StudentSubjectDao;
import com.jsp.hibernate_many_to_many_uni.dto.Student;

public class StudentSubjectsService {


	StudentSubjectDao dao = new StudentSubjectDao();
	
    public  List<Student> saveStudentSubjectsService(List<Student> students){
    	
    	return dao.saveStudentSubjectsDao(students);
    }

	
}
