package com.jsp.hibernate_many_to_one_uni_patientAndDoctor.controller;

import java.util.Scanner;

import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.dto.Doctor;
import com.jsp.hibernate_many_to_one_uni_patientAndDoctor.service.DoctorSevice;

public class DoctorController {

	public static void main(String args[]) {
		
		
		DoctorSevice doctorSevice=null;
		Doctor doctor=null;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("1.insert\n.2  delete Doctor \n3.update method \n 4.delete method BYCollage ID \n 5.display all \n6.display on the basis of Id");
			int key = sc.nextInt();
			switch (key) {
			case 1:{
				  doctor= new DoctorSevice().saveDoctorService(new Doctor(1,"Faizan","Faizan123@gmail.com", "Surgen"));
				  
				  if(doctor != null) {
					  System.out.println("data has saved ");
				  }
				  else {
					  System.out.println("please check your code");
				  }
			}break;
			
			case 2:{
				System.out.println("enter the doctor Id");
				int id =sc.nextInt();
				
				new DoctorSevice().deleteDoctorService(id);
				
				
			}break;
			
			case 4:{
				System.out.println("enter  the Doctor Id");
				int id=sc.nextInt();			
			}
			default:
				break;
			}
	}
	
	}

}
