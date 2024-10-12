package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Doctor;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Patient;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.service.PatientDoctorService;

public class PatientDoctorController {
	
	public static void main(String args[]) {
		
		PatientDoctorService patientDoctorService =null;
		Doctor doctor=null;
	
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.insert\n.2 delete Doctor By PatientID\n3.update method \n 4.delete method BYCollage ID \n 5.display all \n6.display on the basis of Id");
			int choice =sc.nextInt();
			switch (choice) {
			case 1:{
				Patient patient1= new Patient("Suhail", "s@gmail.com");
				Patient patient2=new Patient("Raes","R@gmail.com");
				
				List<Patient> patients =new  ArrayList<Patient>(Arrays.asList(patient1,patient2));
				 new PatientDoctorService().savePatientwithDoctorService(patients, 1);
				
			}break;
			case 2:{
				System.out.println("enter the  PatientId");
				int id =sc.nextInt();
				
			 	new PatientDoctorService().deleteDoctorByPatientIdService(id);
			 	
			 	
			}break;
			default:
				break;
			}
		}
	
	}
	
	
}
