package hotel_Reservation_System_jdbc.controller;

import java.util.Scanner;

import hotel_Reservation_System_jdbc.dto.Customer;
import hotel_Reservation_System_jdbc.serviceImple.CustomerServiceImple;

public class CustomerController {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		CustomerServiceImple service = new CustomerServiceImple();
		Customer cus=new Customer();

		while (true) {
			System.out.print("1 Save/insert Reservation\n 2.display all Reservation ");
			System.out.println("enter the your choice");
			int choice;
			switch (choice = sc.nextInt()) {
			case 1: {
				System.out.println("enter the First Name ");
				String fName=sc.next();
				System.out.println("entter the LName");
				String lName=sc.next();
				String fullName=fName+" "+lName;
				
				System.out.println("enter the email ");
				String email=sc.next();
				System.out.println("enter the Mobile Number");
				String number =sc.next();
				System.out.println("enter the age");
				int age =sc.nextInt();
				System.out.println("enter the room number");
				int room =sc.nextInt();
				System.out.println("enter the address of customer ");
				sc.nextLine();
				String address=sc.nextLine();
				System.out.println("enter the price of the room number");
				double price=sc.nextDouble();
				
				
				
				
			if(cus!=null) {
				System.out.println("Data has been stored");
			}
			else {
				System.out.println("please your query");
			}
			}
				break;
			case 0:
				sc.close();
				return;
			default: {

			}
			}
		}
	}
}
