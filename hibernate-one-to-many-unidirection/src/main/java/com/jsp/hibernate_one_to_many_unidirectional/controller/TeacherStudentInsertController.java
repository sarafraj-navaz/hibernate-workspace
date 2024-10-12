package com.jsp.hibernate_one_to_many_unidirectional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;
import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;
import com.jsp.hibernate_one_to_many_unidirectional.service.TeacherStudentService;



public class TeacherStudentInsertController {

	public static void main(String[] args) {
	
		
		TeacherStudentService service = new TeacherStudentService();
		
		Student st1 = new Student(127, "karan", "karan@gmail.com", 5646758);
		
		Student st2 = new Student(128, "vishal", "vishal@gmail.com",86856567);
		
		List<Student> students = new ArrayList<Student>(Arrays.asList(st1,st2));
		
		Teacher  teacher = new Teacher(420, "Nazim", "nazim420@gmail.com", 657886879,students);
	
		service.saveTeacherService(teacher, students);
	}

}
