package com.jsp.hibernate_one_to_one.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_one.dto.Adhar;
import com.jsp.hibernate_one_to_one.dto.Person;
import com.jsp.hibernate_one_to_one.service.PersonAdharService;

public class PersonAdharController {

	public static void main(String[] args) {

		Person person = null;
		Adhar adhar = null;
		PersonAdharService service = new PersonAdharService();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter main method");

		while (true) {

			System.out.println("choose the option");

			System.out.println("1.insert\n 2.DisplayPersonAdharByPersonId \n 3.delete \n 4.update\n 5.Display");
			int key = sc.nextInt();

			switch (key) {
			case 1: {
				System.out.println("enter the adharNumber");
				Long adharnumber = sc.nextLong();
				System.out.println("enter the adharAddress");
				String address = sc.next();
				System.out.println("enter  the adharDob");
				System.out.println("enter the year of the dob");
				int year = sc.nextInt();
				System.out.println("enter the month of the dob");
				int month = sc.nextInt();
				System.out.println("enter the date of the dob");
				int date = sc.nextInt();
				System.out.println("enter the fatherName");
				String fatherName = sc.next();

				adhar = new Adhar(adharnumber, address, LocalDate.of(year, month, date), fatherName);

				System.out.println("enter the  person Id");
				int personId = sc.nextInt();

				System.out.println("enter the PersonName");
				String personName = sc.next();

				System.out.println("enter the email");
				String personEmail = sc.next();

				System.out.println("enter the person phoneNumber");
				long phoneNumber = sc.nextLong();

				person = new Person(personId, personName, personEmail, phoneNumber, adhar);

				Person  person1= service.savePersonAdharService(person, adhar);

			}
				break;
				
			case 2:{
				System.out.println("enter the Person Id");
				int personId =sc.nextInt();
				
				Person person1= service.getByPersonAdharService(personId);
				
				if(person1 != null) {
					System.out.println("person Detail from the table of the database");
					
					System.out.print("PersonId ===="+person1.getId()+"\t\t\t");
					System.out.print("PersonName ==="+person1.getName()+"\t\t\t");
					System.out.print("PersonEmail ==="+person1.getEmail()+"\t\t\t");
					System.out.print("PersonPhone ===="+person1.getPhone());
					System.out.println(" ");
					
					Adhar adhar1= person1.getAdhar();
					if(adhar1 != null) {
						
						System.out.print("AdharNumber ==="+adhar1.getNumber()+"\t\t\t");
						System.out.print("AdharAdress ==="+adhar1.getAddress()+"\t\t\t");
						System.out.print("adhar Dob ==="+adhar1.getDob()+"\t\t\t");
						System.out.print("fatherName ==="+adhar1.getFathername());
						System.out.println("");
					}
					else {
						System.out.println("adhar is null");
					}
				}
				else {
					System.out.println("person details is null");
				}
				
			}break;
			case  3:{
				System.out.println("enter the Person Id that Id you want to delete from the table");
				int personId =sc.nextInt();
				
				service.deletePersonAdharGetByIdService(personId);
			}
			case 4:{
				System.out.println("enter the PersonId");
				int personId =sc.nextInt();
				
				System.out.println("enter the Name which table name you want to update");
				String personName =sc.next();
				
				Person person1 = service.updatePersonAdharBygetIdService(personName, personId);
				
				if(person1 != null) {
					System.out.println("data has been update of the table");
				}
				else {
					System.out.println("please try whatever you have enterd personId it is not persent");
				}
			}
			case  5:{
				System.out.println("Display all the of the person whatever persent in the table yet");
				
				List<Person> person1= service.displayAllService();
				
				for (Person person2 : person1) {
					System.out.println(person2);
				}
				
			}
			default:
				break;
			}
		}

	}

}
