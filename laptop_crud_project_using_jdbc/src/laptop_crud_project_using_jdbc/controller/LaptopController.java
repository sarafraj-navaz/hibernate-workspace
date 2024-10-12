package laptop_crud_project_using_jdbc.controller;

import java.util.List;
import java.util.Scanner;

import laptop_crud_project_using_jdbc.dto.Laptop;
import laptop_crud_project_using_jdbc.serviceImple.LaptopServiceImplement;

public class LaptopController {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		LaptopServiceImplement service=new LaptopServiceImplement();
	    Laptop s  =new Laptop();
		
		while(true) {
			System.out.println("1.insert\n 2. displaybyLaptopId\n 3.display all\n 4.DeleteMethodByLaptopID\n5.check LaptopId  \n 6.update method");
			System.out.println("enter the choise");
			int choise = sc.nextInt();
			switch(choise) {
			case 1:{
//			      s.setLaptopId(121);
//			      s.setLaptopName("Dell");
//			      s.setLaptopPrice(20000);
//			      s.setSellerName("Navaz");
				
				 s=new Laptop(123, "Realmi","midNight", 2000000,"Raj");
			      
			      service.saveLaptopService(s);
			    
	         	if(s != null) {
	         		System.out.println("data has been saved");
	         	}
	         	else {
	         		System.out.println("please check your code");
	         	}
			}break;
			case 2:{
				   System.out.println("enter the laptopId");
				   int id =sc.nextInt();
				   
				   s=service.getByLaptopidService(id);
				   if(s!=null) {
					
					   System.out.println("laptop Id "+s.getLaptopId());
					   System.out.println("laptop Brand name "+s.getLaptopBrandName());
					   System.out.println("Laptop color  "+s.getLaptopColor());
					   System.out.println("laptop price "+s.getLaptopPrice());
					   System.out.println("laptop seller Name "+s.getSellerName());
				   }
				   else {
					   System.out.println("please check your code");
				   }
			}break;
			case 3:{
				 List<Laptop> laptops=service.getDisplayAllDao();
				 
				 for(Laptop laptop :laptops) {
					 System.out.println(laptop.getLaptopId()+" "+laptop.getLaptopBrandName()+" "+laptop.getLaptopColor()+" "+laptop.getLaptopPrice()+" "+laptop.getSellerName());
				 }
			}break;
			case 4:{
				System.out.println("enter the laptop id which laptopId you want to delete");
				int id =sc.nextInt();
				
				 if(service.getbyLaptopIdDaoTOCheckService(id)>0) {
					 service.deleteByLaptopIdService(id);
					 System.out.println("Data has been deleted succeesfully");
				 }else {
					 System.out.println("Laptop id is not present please check your Id");
				 }
	
			}break;
			case 5:{
				System.out.println("enter the laptopId which laptop to check");
				int id =sc.nextInt();
				
				int tableId=service.getbyLaptopIdDaoTOCheckService(id);
				if(id ==tableId) {
					System.out.println("Laptop is present in the laptop table");
					System.out.println("Tabtop Id =="+tableId);
				}
				else {
					System.out.println("tableId and User Input doesn't match  ");
				}
			}break;
			case 6:{
				System.out.println("enter the laptopId from which you want to update all details");
				int id =sc.nextInt();
				System.out.println("enter the new LaptopId");
				int new1 =sc.nextInt();
				System.out.println("Laptop Brand Name ");
				String laptopBrandName=sc.next();
				System.out.println("enter the laptop color");
				String color=sc.next();
				System.out.println("laptop update Price");
				double price=sc.nextDouble();
				System.out.println("enter new seller Name");
				String sellerName=sc.next();
				
				s=new Laptop(new1, laptopBrandName, color, price, sellerName);
				
				int check=service.updateAllByLaptopIdDao(s, id);
				if(check!=0) {
					System.out.println("Data has been updated");
				}
				else {
					System.out.println("please check your input fields");
				}
			}break;
			default:{
				
			}
			}
		}
	}

}
