package com.jsp.hibernate_second_time.controller;

import java.util.List;
import java.util.Scanner;

import com.jsp.hibernate_second_time.dto.Employee;
import com.jsp.hibernate_second_time.service.EmployeeService;

public class InsertController {

	public static void main(String[] args) {
		Employee employee = null;
		EmployeeService employeeService = null;
		Scanner sc =new Scanner(System.in);

		while (true) {
			System.out.println(
					"1.insert\n2.getById\n3.delete\n4.update\n5.display All data"
					+ "\n6.display All Employee who's Salary bitween 3000 and 50000\n7.on the basis of name");
			int key = sc.nextInt();

			switch (key) {
			case 1: {
				System.out.println("enter the empId");
				int id = sc.nextInt();
				System.out.println("enter the empName");
				String name = sc.next();
				System.out.println("enter the empEmail");
				String email = sc.next();
				System.out.println("enter the empSalary");
				double sal = sc.nextDouble();

				System.out.println("enter the empNumber");
				long phone = sc.nextLong();

				new EmployeeService().saveMethodEmployeeService(new Employee(id, name, email, sal, phone));

			}
				break;
			case 2: {
				System.out.println("enter the empId");
				int id = sc.nextInt();

				employee = new EmployeeService().getByEmpIdService(id);
				if (employee != null) {
					System.out.println(employee);
				} else {
					System.out.println("please check your given empId");
				}
			}
				break;
			case 3: {
				System.out.println("enter  the empId");
				int id = sc.nextInt();
				employee = new EmployeeService().deleteBygetByempIdService(id);
				if (employee != null) {
					System.out.println("data has been deleted Successfully");
				} else {
					System.out.println("please check your given empId");
				}
			}
				break;
			case 4: {
				System.out.println("enter the empId ");
				int id = sc.nextInt();
				System.out.println("enter the empName");
				String name = sc.next();

				employee = new EmployeeService().updateNameGetByIdService(id, name);

				if (employee != null) {
					System.out.println("data has been update ");
				} else {
					System.out.println("please check your given empId");
				}
			}
				break;
			case 5: {
				List<Employee> employees = new EmployeeService().displayAllDataService();
				employees.forEach(a->System.out.println(a));
			}
				break;
			case 6: {
				List<Employee> employees = new EmployeeService().displayAllDataService();
				for (Employee employee2 : employees) {
					if ((employee2.getEmployeeSal() >= 3000) && (employee2.getEmployeeSal() <= 50000)) {
						System.out.println(employee2);
					}
				}  
			}break;
			case 7:{
				System.out.println("enter the name who's employee details you want to find");
				String name =sc.next();
				List<Employee> employees = new EmployeeService().displayAllDataService();
				for (Employee employee2 : employees) {
					if(employee2.getEmployeeName().equals(name)) {
						System.out.println(employee2);
					}
				}
			}break;
			default:
				break;
			}
		}

	}

}
