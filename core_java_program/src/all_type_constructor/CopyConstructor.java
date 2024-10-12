package all_type_constructor;

public class CopyConstructor {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.name="raja";
		s1.roll=123;
		s1.password="abc";
		System.out.println(s1);
		
		Student1 s2 =new Student1(s1);
		s2.password="S2@123";
		System.out.println(s2.name);
		
		
		
		
		s1.password="sara@123";
		System.out.println(s1);
	}	
	
}

class Student1{
	String name;
	int roll;
	String password;
	
	Student1(){
		System.out.println("Non Parameterized Constructor");
	}
	Student1(String name){
		this.name=name;
	}
	Student1(Student1 s1){
		this.name=s1.name;
		this.roll=s1.roll;
	}
}
