package core_java_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployDriver {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("1.insert\n2.display");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:{
				List<Employ> l1=new ArrayList<Employ>();
				
				Employ employ =new Employ("Shaikh",22,2345.342,"TCS01");
				Employ employ1 =new Employ("Navaz",23,2345.322,"TCS02");
				Employ employ2 =new Employ("Sarafraj",24,2345.342,"TCS03");
				Employ employ3 =new Employ("Sarafraj Navaz",25,24345.32,"TCS04");
				Employ employ4 =new Employ("Nehal",26,223.323,"TCS05");
				
				l1.add(employ);
				l1.add(employ1);
				l1.add(employ2);
				l1.add(employ3);
				l1.add(employ4);
				
				EmployManager.saveListOfEmploy(l1);
			}break;
			default :{
				System.out.println("enter the correct choise");
			}break;
			}
		}
	}

}
