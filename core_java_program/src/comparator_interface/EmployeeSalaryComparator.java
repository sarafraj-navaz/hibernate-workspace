package comparator_interface;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	
	public int compare(Employee e1,Employee e2) {
		return (int)(e1.eSalary-e2.eSalary);
	}
}
