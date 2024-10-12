package com.jsp.hibernate_one_to_one1.controller;

import java.util.Scanner;

import org.hibernate.loader.custom.ScalarResultColumnProcessor;

import com.jsp.hibernate_one_to_one1.dto.Employ;
import com.jsp.hibernate_one_to_one1.dto.Laptop;
import com.jsp.hibernate_one_to_one1.service.EmployLaptopService;

import net.bytebuddy.asm.Advice.Exit;

public class EmployLaptopController {

	public static void main(String[] args) {
	
		
		EmployLaptopService service = new EmployLaptopService();	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.insert");
			System.out.println("enter  the choise");
			int choice =sc.nextInt();

			
			switch (choice) {
			case 1:
			{
				
				System.out.println("enter the laptop quality");
				int l1=sc.nextInt();
				System.out.println("enter the name of the laptop");
				String lName=sc.next();
				
				System.out.println("enter the EmployId");
				int id=sc.nextInt();
				System.out.println("enter the EmployName");
				String name=sc.next();
				System.out.println("enter the EmployEmail");
				String email=sc.next();
			    service.saveEmployPersonService(new Employ(id, name, email, new Laptop(l1, lName)));
				/*
				 * service.saveEmployPersonService(new Employ(1,"s","s@gmail.com", new
				 * Laptop(2,"hp")));
				 */
			}break;
	
			case 2:{
				System.out.println("enter  the EmployId");
				int id=sc.nextInt();
				
				Employ employ= service.getByEmployIdService(id);
			    System.out.println(employ);
			}
			break;
			default:
				break;
			}
		}
	}

}
