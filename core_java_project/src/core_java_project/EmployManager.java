package core_java_project;

import java.util.Iterator;
import java.util.List;

public class EmployManager {
	
	public static void saveListOfEmploy(List<Employ> employ) {
		for(Employ e1:employ) {
			System.out.println(e1);
		}
	}

	public static void getAllDetailsAge30(List<Employ> employs) {
		
		for(Employ employ:employs) {
			if(employ.employAge>=30) {
				System.out.println(employ);
			}
		}
	}
	
	public static void getAllDetailsBySalaryFilter(List<Employ> employs) {
		for (Employ employ : employs) {
			if(employ.employSalary>=18000 && employ.employSalary <=45000) {
				System.out.println(employ);
			}
		}
	}
	
	public static void getfilterAgeAndSalaryByList(List<Employ> employs) {
		
		for(Employ employ:employs) {
			if((employ.employAge <=27) && (employ.employSalary>=25000)) {
				System.out.println(employ);
			}
		}
	}
	
	public static void getEmployDetaildBYEmployID(List<Employ> employs,String employId) {
		
		for(Employ employ :employs) {
			
			if(employ.employId.equals(employId)) {
				System.out.println(employ);
			}
		}
	}
}
