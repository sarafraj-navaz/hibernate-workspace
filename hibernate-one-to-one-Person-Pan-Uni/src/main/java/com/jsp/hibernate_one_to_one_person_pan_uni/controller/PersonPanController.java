package com.jsp.hibernate_one_to_one_person_pan_uni.controller;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Pan;
import com.jsp.hibernate_one_to_one_person_pan_uni.dto.Person;
import com.jsp.hibernate_one_to_one_person_pan_uni.service.PersonPanService;

public class PersonPanController {

	public static void main(String[] args) {

		PersonPanService service ;
		Scanner sc = new Scanner(System.in);
		Person person;
		Pan pan;

		while (true) {
			System.out.println("1.insert\n.2getBId\n3.update method \n 4.delete \n 5.display all \n6.display on the basis of Id");
			int key = sc.nextInt();
			switch (key) {
			case 1: {
				/*
				 * pan = new Pan(9211, "noida", "shahajad"); person = new Person(1, "nehal",
				 * "n@gmail.com", pan); new PersonPanService().savePersonPanService(person,
				 * pan);
				 */
				
				System.out.println("enter the PersonId");
				int id =sc.nextInt();
				System.out.println("enter the Person name");
				String name =sc.next();
				System.out.println("enter the email");
				String email =sc.next();
				System.out.println("enter the Pan number");
				int panID=sc.nextInt();
				System.out.println("enter the Pan address");
				String address=sc.next();
				System.out.println("enter the father name ");
				String fathername=sc.next();
				pan =new Pan(panID, address, fathername);
				person =new Person(panID, name, email, pan);
				
			     new PersonPanService().savePersonPanService(person, pan);
			}
				break;
			case 2: {
				System.out.println("enter the person Id ");
				int personId = sc.nextInt();
				/*
				 * person= new PersonPanService().getPanPersonByPersonIdService(personId);
				 * if(person != null) { System.out.println(person); }
				 */
				person = new PersonPanService().getPanPersonByPersonIdService(personId);
				if (person != null) {
					System.out.println("=====person details=============");
					System.out.println(person);
					pan= person.getPan();
					if(pan != null) {
						System.out.println("Pan details=====");
						System.out.println(pan);
					}
					else {
						System.out.println("=====pan is null");
					}
					
				} else {
					System.out.println("you should check your given Id");
				}
			}
				break;
			case 4:{
				System.out.println("enter the person ID");
				int id=sc.nextInt();
				new PersonPanService().deletePanPersonByPersonIdService(id);
			}break;
			case 3:{
				System.out.println("enter the person id");
				int id =sc.nextInt();
				System.out.println("enter the new address");
				String address=sc.next();
				person =new PersonPanService().updatePanPersonByPersonIdDao(id, address);
				if(person != null) {
					System.out.println("updated pan address");
				}
				else {
					System.out.println("please chech your given Id ");
				}
			}break;
			case 5:{
				service=new PersonPanService();
				/*
				 * for (Person loop : service.displayAllService()) {
				 * System.out.println("--------person details----");
				 * System.out.println(" id----"+loop.getPersonId());
				 * 
				 * pan=loop.getPan(); if(pan != null) {
				 * System.out.println("-------pan--details---");
				 * System.out.println("pan id ------"+pan.getPanNumber()); } }
				 */
				for(Person person2 :service.displayAllService()) {
					System.out.println(person2);
				}
			}break;
			case 6:{
				List<Person> list=new PersonPanService().displayAllService();
				Collections.sort(list);
				for(Person person2 :list) {
					System.out.println(person2);
				}
			}
			default:
				break;
			}
		}

	}

}
