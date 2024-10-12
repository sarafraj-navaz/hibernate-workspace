package comparator_interface;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.age-e1.age;
	}
}
