package method_overriding;

public class Driver {

	public static void main(String[] args) {
		
//		it is normal object creation
	   Vehicle v1= new Vehicle();
	   v1.display();
//		it is normal object creation		   
	   Car c1=new Car();
	   c1.display();
//   it is method overriding 	   
	    Vehicle v2 = new Car();
	    v2.display();
	    
	    Vehicle v3 = new Car();
	    Car c22 =(Car)v3;
	    c22.display();
	    
	}
}
