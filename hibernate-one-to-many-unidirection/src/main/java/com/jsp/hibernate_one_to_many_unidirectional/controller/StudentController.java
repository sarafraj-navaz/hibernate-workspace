package com.jsp.hibernate_one_to_many_unidirectional.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Student;
import com.jsp.hibernate_one_to_many_unidirectional.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		StudentService service = new StudentService();

		Scanner sc = new Scanner(System.in);

		Student student = null;

		while (true) {
			System.out.println("1.insert \n 2.getStudentById \n 3.delete \n 4.update \n 5.display");
			System.out.println("enter the choice");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("enter the StudentID");
				int studentID = sc.nextInt();
				
				System.out.println("enter the Student Name");
				String studentName = sc.next();
				
				System.out.println("enter the Student Email");
				String studentEmail = sc.next();
				
				System.out.println("Enter the Student Phone Number");
				long studentNumber =sc.nextLong();
				
				Student student1= service.saveStudentDao(new Student(studentID, studentName, studentEmail, studentNumber));
				
				if(student1 != null) {
					System.out.println("data has been save in the Table");
				}
				else {
					System.out.println("data has not been save in the table");
				}
			}break;
            
			case 2:{
				System.out.println("enter the StudentID");
				int studentId =sc.nextInt();
				
				 Student student1= service.getStudentBYIdService(studentId);
				 
				 if(student1 !=  null) {
					 System.out.println(student1);
				 }
				 else {
					 System.out.println("please check your StudentID");
				 }
				
				
			}break;
			
			case 3:{
				System.out.println("enter the studentId");
				int studentId =sc.nextInt();
				
				if(service.deleteStudentByIdService(studentId)) {
					
					System.out.println("data has been deleted yet");
				}
				else {
					System.out.println("please check your given Id ");
				}
			} break;
			
			case  4:{
				System.out.println("enter the studentId");
				int studentId =sc.nextInt();
				
				System.out.println("enter the studnetName");
				String studentName =sc.next();
				
				Student student1= service.updateStudentByIdDao(studentId, studentName);
				
				if(student1 != null) {
					
					System.out.println("data has been updated yed");
				}
				else {
					System.out.println("please check your StudentId");
				}
			}break;
			
			case 5:{
				List<Student> student1= service.displayAllService();
				
				for(Student student2 :student1) {
					System.out.println(student2);
				}
				
			}
			default:
				break;
			}
		}
	}

}
