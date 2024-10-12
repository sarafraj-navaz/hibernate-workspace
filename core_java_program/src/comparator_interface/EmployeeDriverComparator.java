package comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDriverComparator {

	public static void main(String[] args) {
	 	List<Employee> l1= new ArrayList<Employee>();
	 	Employee e1 = new Employee(2, "faizan", 7862.07, 20);
	 	Employee  e2= new Employee(1, "suhail",686868,21);
	 	Employee e3 =new Employee(4, "raza",767676.01,22);
	 	l1.add(e1);
	 	l1.add(e2);
	 	l1.add(e3);
	 	for (Employee employee : l1) {
			System.out.println(employee);
		}
	 	System.out.println("sort on the basis of eid");
	 	Collections.sort(l1,new EmployeeIdComparator());
	 	for (Employee employee : l1) {
			System.out.println(employee);
		}
	 	System.out.println("sort on the basis of eName");
	 	Collections.sort(l1,new EmployeeNameComparator());
	 	for (Employee employee : l1) {
			System.out.println(employee);
		}
	 	System.out.println("sort on the basis of eSalary");
	 	Collections.sort(l1, new EmployeeSalaryComparator());
	 	for (Employee employee : l1) {
			System.out.println(employee);
		}
	}

}
