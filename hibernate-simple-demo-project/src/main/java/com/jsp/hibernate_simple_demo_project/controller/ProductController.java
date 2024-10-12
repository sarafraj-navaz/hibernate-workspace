package com.jsp.hibernate_simple_demo_project.controller;



import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_simple_demo_project.dto.Product;
import com.jsp.hibernate_simple_demo_project.service.ProductService;

public class ProductController {

	public static void main(String[] args) {
		
		
		Product product =null;
		
		ProductService service = new ProductService();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			System.out.println("1.insert \n 2.delete\n 3.update method \n4.display all\n 5.getById");
			System.out.println("enter the your choice");
			
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1:{
				
				System.out.println("enter the productId");
				int productId =sc.nextInt();
				
				System.out.println("enter the productName");
				String productName =sc.next();
				
				System.out.println("enter the productColor");
				String productColor =sc.next();
				
				System.out.println("enter the productPrice");
				double productPrice =sc.nextDouble();
				
				service.saveProductService(new Product(productId, productName, productColor, productPrice));
				
			}break;
			case 2:{
				System.out.println("enter the ProductId");
				int productId =sc.nextInt();
			 
				if(service.deleteProductByIdService(productId)) {
					System.out.println("data has been deleted from the table");
				}
				else {
					System.out.println("please check your productId");
				}
			 
			}break;
			case 3:{
				System.out.println("enter the productId");
				int  productId =sc.nextInt();
				
				System.out.println("enter the ProductName");
				String productName = sc.next();
				
				Product product1 = service.updateProductNameByIService(productId, productName);
				
				if(product1 != null) {
					System.out.println("data has been updated from the user to table");
				}
				else {
					System.out.println("please check your given Id");
				}
			}break;
			case 4:{
				
				List<Product> products = service.displayAllDao();
				
				for (Product product2 : products) {
				
					System.out.println(product2);
				}
			}break;
			case 5:{
				System.out.println("enter the ProductId");
				int productId =sc.nextInt();
				
				Product product1 = service.getByIdService(productId);
				if(product1 != null) {
					System.out.println(product1);
				}
				else {
					System.out.println("please check your given ProductId");
				}
			} break;
			default:
				break;
			}
			
		}
		

	}

}
