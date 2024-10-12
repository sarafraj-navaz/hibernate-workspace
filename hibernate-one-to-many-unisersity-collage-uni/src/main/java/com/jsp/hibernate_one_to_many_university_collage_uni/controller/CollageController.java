package com.jsp.hibernate_one_to_many_university_collage_uni.controller;

import java.util.Scanner;

import com.jsp.hibernate_one_to_many_university_collage_uni.dto.Collage;
import com.jsp.hibernate_one_to_many_university_collage_uni.service.CollageService;

public class CollageController {
	
	public static void main(String args[]) {
	
		Collage collage =null;
		Scanner sc = new Scanner(System.in);
		CollageService collageService=null;
		
		while (true) {
			System.out.println("1.insert\n.2getBId\n3.update method \n 4.delete method BYCollage ID \n 5.display all \n6.display on the basis of Id");
			int key = sc.nextInt();
			switch (key) {
			case 1:{
				new CollageService().saveMethodDao(new Collage("HMFA","Allahabad","B.Tech"));
			}break;
			
			case 4:{
				System.out.println("enter  the collage Id");
				int id=sc.nextInt();
				
				new CollageService().deleteCollgeByCollageIdService(id);
			}
			default:
				break;
			}
	}
	
	}
}