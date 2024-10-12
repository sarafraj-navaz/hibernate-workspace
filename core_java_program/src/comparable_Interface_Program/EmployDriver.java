package comparable_Interface_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployDriver {

	public static void main(String[] args) {
		List<Employ> l1= new ArrayList<Employ>();
		Employ e1=new Employ(2,"shaikh","s@gmail.com",23.3,22);
		Employ e2=new Employ(3,"raj","r@gmail.com",26.3,2);
		Employ e3=new Employ(1,"Nehal","N@gmail.com",46.4,12);
		Employ e4=new Employ(4,"Nawaz","Navaz@gmail.com",56.4,232);
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		for (Employ employ : l1) {
			System.out.println(employ);
		}
		System.out.println("==============");
		Collections.sort(l1);
		for (Employ employ : l1) {
		    System.out.println(employ);
		    System.out.println(" ");
		}
		
		

	}

}
