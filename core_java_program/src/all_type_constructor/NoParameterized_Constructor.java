package all_type_constructor;

public class NoParameterized_Constructor {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="raja";
		s1.roll=123;
		s1.password="abc";
		System.out.println(s1);
		
		Student s2 =new Student(s1);
		s2.name="nehal";
		s2.password="S2@123";
		System.out.println(s2);
		
		s1.password="sara@123";
		System.out.println(s1);
	}	

}
class Student{
	String name;
	int roll;
	String password;
	
	Student(){
		System.out.println("Non Parameterized Constructor");
	}

	/*
	 * Student(String name){ this.name=name; } Student(int roll){ this.roll=roll; }
	 */
	//Copy Constructor
	Student(Student s1){
		this.name=s1.name;
		this.roll=s1.roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", password=" + password + "]";
	}
	
	
}
