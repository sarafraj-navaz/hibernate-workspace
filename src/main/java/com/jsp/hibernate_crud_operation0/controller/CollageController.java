package com.jsp.hibernate_crud_operation0.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_crud_operation0.dto.Collage;
import com.jsp.hibernate_crud_operation0.service.CollageService;

public class CollageController {

	public static void main(String[] args) {
		CollageService service =null;
		Scanner scanner = new Scanner(System.in);
		Collage  collage=null;
		
		while (true) {
			System.out.println("1.insert\n2.getById\n3.update\n4.delete\n.5 display");
		     int key=scanner.nextInt();
		     
		     switch (key) {
			case 1:{
				System.out.println("enter the collage Id");
				int id =scanner.nextInt();
				System.out.println("enter  the collage Name ");
				String name =scanner.next();
				System.out.println("enterthe collage address");
				String address=scanner.next();
				System.out.println("enter the collage pincode");
				long pincode =scanner.nextLong();
				 collage=new CollageService().saveCollageService(new Collage(id, name, address, pincode));
				if(collage != null) {
					System.out.println(collage);
				}
			}break;
			case 2:{
				System.out.println("enter the collage Id which collage details do you want?");
				int id=scanner.nextInt();
				collage= new CollageService().getByCollageIdService(id);
				if(collage != null) {
					System.out.println(collage);
				}
				else {
					System.out.println("please check your given collage Id");
				}
			}break;
			case 3:{
				System.out.println("enter the collage Id ");
				int id=scanner.nextInt();
				System.out.println("enter the collage name");
				String name =scanner.next();
				collage = new CollageService().updateDaoGetByCollageIdService(id, name);
				if(collage != null) {
					System.out.println("collage name has been updated");
				}
				else
				{
					System.out.println("please your check given Collage Id");
				}
			}break;
			case 4:{
				System.out.println("enter  the collage id");
				int id =scanner.nextInt();
				collage = new CollageService().deleteDaogetByCollageIDService(id);
				if(collage != null) {
					System.out.println("details has been deleted from the table");
				}
				else {
					System.out.println("please check your given collage Id");
				}
			}break;
			case 5:{
				List<Collage>  collages=new CollageService().displayAllDataService();
				collages.forEach(a->System.out.println(a));
				/* employees.forEach(a->System.out.println(a)); */
			}break;
			default:
				break;
			}
			
		}
		

	}

}
