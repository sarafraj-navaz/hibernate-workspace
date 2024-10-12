package com.jsp.hibernate_one_to_many_unidirectional.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_many_unidirectional.dto.Teacher;
import com.jsp.hibernate_one_to_many_unidirectional.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		
		
     TeacherService service = new TeacherService();
     Scanner sc = new Scanner(System.in);
     
     Teacher teacher =null;
     
     while(true) {
    	 System.out.println("1.insert \n 2.GetTeacherById \n 3.delete \n 4.update \n 5.display");
    	 int choice =sc.nextInt();
    	 
    	 System.out.println("enter the choice ");
      
    	 switch (choice) {
		case 1:{
			System.out.println("enter the Teacher Id");
			int teacherId =sc.nextInt();
			
			System.out.println("enter the Teacher Name");
			String teacherName =sc.next();
			
			System.out.println("enter the teacher Email");
			String  teacherEmail =sc.next();
			
			System.out.println("enter the teacher Phone Number");
			long teacherNumber =sc.nextLong();
			
			service.saveTeacherDao(new Teacher(teacherId, teacherName, teacherEmail, teacherNumber));
			
		}break;

		case 2:{
			System.out.println("enter the teacherId");
		    int teacherId =sc.nextInt();
		    
		    Teacher teacher1= service.getTeacherByIdService(teacherId);
		    if(teacher1 != null) {
		    	System.out.println(teacher1);
		    }
		    else {
		    	System.out.println("please check your TeacherId");
		    }
		}break;
		case 3:{
			System.out.println("enter the teacher Id");
			int teacherId =sc.nextInt();
			
			if(service.deleteTeacherByIdService(teacherId)) {
				System.out.println("data has been deleted from the teacher ");
				
			}
			else {
				System.out.println("please check your given teacherId");
			}
		}break;
		
		case 4:{
			System.out.println("enter the teacher Id");
			int teacherId =sc.nextInt();
			
			System.out.println("enter the teacher Name");
			String teacherName =sc.next();
			
			Teacher teacher1= service.updateTeacherByIdService(teacherId, teacherName);
			if(teacher1 != null) {
				System.out.println("data has been update ");
			}
			else {
				System.out.println("please check your given teacher Id");
			}
		}break;
		case 5:{
		           List<Teacher> teacher1= service.displayAllTeacherDao();
		           for(Teacher teacher2 :teacher1) {
		        	   System.out.println(teacher2);
		           }
		           
		}break;
		default:
			break;
		}
     }

	}

}
