package core_java_project;

public class Employ {
	
	String employName;
	int employAge;
	double employSalary;
	String employId;
	
	Employ(){
		
	}
	Employ(String name,int age,double salary,String id){
		this.employName=name;
		this.employAge=age;
		this.employSalary=salary;
		this.employId=id;
	}
	
	@Override
	public String toString() {
		return "Employ [employName=" + employName + ", employAge=" + employAge + ", employSalary=" + employSalary
				+ ", employId=" + employId + "]";
	}
}
