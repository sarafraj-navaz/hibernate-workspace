package core_java_project;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class EmployDriver1 {

	public static void main(String[] args) {
		
		List<Employ> l1=new ArrayList<Employ>();
	
		Employ employ =new Employ("Shaikh",22,2345.342,"TCS01");
		Employ employ1 =new Employ("Navaz",23,2345.322,"TCS02");
		Employ employ2 =new Employ("Sarafraj",24,2345.342,"TCS03");
		Employ employ3 =new Employ("Sarafraj Navaz",25,24345.32,"TCS04");
		Employ employ4 =new Employ("Nehal",30,223.323,"TCS05");
		Employ employ5 =new Employ("Nehal1",26,30000.01,"TCS06");
		
		l1.add(employ);
		l1.add(employ1);
		l1.add(employ2);
		l1.add(employ3);
		l1.add(employ4);
		l1.add(employ5);
		
		EmployManager.saveListOfEmploy(l1);

		System.out.println("==========================");
		System.out.println("Access all the element which has age<=30");
		
		EmployManager.getAllDetailsAge30(l1);
		
		System.out.println("Access All Employee with salary 18k-45k=========");
		EmployManager.getAllDetailsBySalaryFilter(l1);
		
		System.out.println("Access All Employee age<=27 && salary>=25k=========");
		EmployManager.getfilterAgeAndSalaryByList(l1);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the employId ");
		String employId =sc.next();
		
		EmployManager.getEmployDetaildBYEmployID(l1, employId);
	}

}
