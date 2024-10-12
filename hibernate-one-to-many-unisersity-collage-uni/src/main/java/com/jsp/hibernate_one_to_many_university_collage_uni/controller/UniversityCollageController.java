package com.jsp.hibernate_one_to_many_university_collage_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;
import com.jsp.hibernate_one_to_many_university_collage_uni.dto.University;
import com.jsp.hibernate_one_to_many_university_collage_uni.service.CollageService;
import com.jsp.hibernate_one_to_many_university_collage_uni.service.UniversityCollageService;

public class UniversityCollageController {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		UniversityCollageService collageService =null;
		University university  =  null;
		


		while (true) {
			System.out.println("1.insert\n.2.mergeOneMoreCollageInUniverty\n3.mergeOneMoreCollageInUniverty bucks fix by native Query\n4.getALLCollage details with University Id \n 5.delete \n 6.display all \n7.display on the basis of Id");
			int key = sc.nextInt(); 
			switch (key) {
			case 1:{
				Collage collage1= new Collage("BBa","Allahabad","aajshj");
				
			     Collage collag2 = new Collage("Ba","Allahabad","Bca");
			     
			     List<Collage> l1 =new ArrayList<Collage>();
			     
			     l1.add(collage1);
			     l1.add(collag2);
				
			     university =new University(1,"aktu","lucknow");
			     
			     university.setCollages(l1);
			     
			       
			     new UniversityCollageService().saveUniversityCollage(university,l1);
			     
			     
			}break;
			case 2:{
				university= new UniversityCollageService().mergeCollageWithUniversityService(3,1);
				if(university != null) {
					System.out.println("data merge in the table");
				}
				else {
					System.out.println("please check your code");
				}
			}break;
			case 3:{
				university= new UniversityCollageService().mergeCollageWithUniversityDaoFixBuck(3,1);
				if(university != null) {
					System.out.println("data merge in the table");
				}
				else {
					System.out.println("please check your code");
				}
			}break;
			case 4:{
				System.out.println("enter the university Id");
				int id =sc.nextInt();
				university= new UniversityCollageService().getAllCollageDetailsWithUniversityIdService(id);
				
				if (university != null) {
					
					System.out.println("-----------University details----------- ");
					System.err.println(university);
					List<Collage> colList =university.getCollages();
					System.out.println("---------------------collage details-----------");
					colList.forEach(a->System.err.println(a+" "));
				}
			}break;
			default:
				break;
			}
	}

	}

}
