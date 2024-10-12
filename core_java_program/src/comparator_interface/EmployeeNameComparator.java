package comparator_interface;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
	
	public int compare(Employee e1,Employee e2) {
		return (int)(e1.eName.compareTo(e2.eName));
	}
}
