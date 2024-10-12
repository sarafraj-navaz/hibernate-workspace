package com.jsp.hibernate_many_to_one_and_one_to_many_bi.controller;

import java.util.Scanner;

import com.jsp.hibernate_many_to_one_and_one_to_many_bi.dto.Teacher;
import com.jsp.hibernate_many_to_one_and_one_to_many_bi.service.TeacherService;

public class TeacherController {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		TeacherService service = new TeacherService();
		Teacher  teacher= null;
		
		while (true) {
			
			System.out.println("1.insert\n 2.getGyTeacherId");
			System.out.println("enter the choice");
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1:
				
				new TeacherService().saveTeacherService(new  Teacher());
				break;

			default:
				break;
			}
			
		}
	}

}
