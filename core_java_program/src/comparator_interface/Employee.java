package comparator_interface;

public class Employee  {
	int eId;
	String eName;
	double eSalary;
	int age;
	public Employee() {
	}
	public Employee(int eId,String eName,double eSalary,int age) {
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		this.age=age;
	}	
	@Override
	public String toString() {
		return eId+" "+eName+" "+eSalary+" "+age; 
	}
}
