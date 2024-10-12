package com.jsp.hibernate_many_to_one_uni.controller;

import java.util.Scanner;

import com.jsp.hibernate_many_to_one_uni.dto.Car;
import com.jsp.hibernate_many_to_one_uni.service.CarService;

public class CarController {

	public static void main(String[] args) {
		
		
		CarService service =  new CarService();
		
		Car  car =null;
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("enter the option");
			System.out.println("1.insert \n 2.GetByCarId \n 3.update");
			
			
			int choice =sc.nextInt();
			
			switch (choice) {
			case 1:{
				
				System.out.println("enter the CarId");
				int carID =sc.nextInt();
				
				System.out.println("enter the CarName");
				String carName =sc.next();
				
				System.out.println("enter the Car  Color ");
				String carColor =sc.next();
				
				System.out.println("enter  the price  number");
				double carPrice =sc.nextDouble();
				
				 car = new Car(carID, carName, carColor, carPrice);
				 
				 service.saveCarService(car);
						
			}
				
				break;
				
				
			case 2:{
				
				System.out.println("enter the CarID which row you want to display");
				
				int carId =sc.nextInt();
				
				Car car1 = service.getByCarService(carId);
				
				if(car1 != null) {
					System.out.println(car1);
				}
				else {
					System.out.println("please check your Id");
				}
				
			}

			case 3:{
				System.out.println("enter the CarId");
				int carId = sc.nextInt();
				
				System.out.println("enter the Car Name");
				String carName =sc.next();
				
				Car updateCar= service.updategetByCarService(carId, carName);
				
				if(updateCar != null) {
					
					System.out.println("Data has been updated ");
				}
				else {
					System.out.println("Please check your CarID");
				}
				
			}
			default:
				break;
			}
			
			
		}
		

	}

}
