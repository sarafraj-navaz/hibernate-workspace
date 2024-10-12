package java_DSA_Question_Apana_Collage.method_Initilization;

public class EmployDriver {

	public static void main(String[] args) {
		System.out.println("main method");
		
		//by using constructor 
		Employ employ = new Employ(1,"raj"); 
		System.out.println(employ.employId);
		System.out.println(employ.employName);
		
		//using Object riference of the Object
		Employ employ2 = new Employ();
		employ2.employId=123;
		employ2.employName="salshi";
		
		System.out.println(employ2.employId);
		System.out.println(employ2.employName);
		
		//by non static method
		employ2.method1(111,"Raj");
		System.out.println(employ2.employId);
		System.out.println(employ2.employName);

	}

}
