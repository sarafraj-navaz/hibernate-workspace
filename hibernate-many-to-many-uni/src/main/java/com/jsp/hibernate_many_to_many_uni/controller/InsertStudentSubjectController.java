package com.jsp.hibernate_many_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.hibernate_many_to_many_uni.dto.Student;
import com.jsp.hibernate_many_to_many_uni.dto.Subject;
import com.jsp.hibernate_many_to_many_uni.service.StudentSubjectsService;

public class InsertStudentSubjectController {

	public static void main(String[] args) {
	
		List<Subject> subjects = new ArrayList<Subject>();
		
		subjects.add(new Subject(123,"n","n@gmail.com"));
		subjects.add(new Subject(121,"n1","qn@gmail.com"));
		
		
		List<Student> students =new ArrayList<Student>();
		students.add(new Student(234, "ansari","a@gmail.com", subjects));
		students.add(new Student(21, "sari","ansari@gmail.com", subjects));
		
		
		
		new StudentSubjectsService().saveStudentSubjectsService(students);
	}

}
