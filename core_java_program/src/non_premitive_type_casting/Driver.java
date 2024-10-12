package non_premitive_type_casting;

public class Driver {
	
	public static void main(String[] args) {
		
//		it is upcasting process
		System.out.println("===by using upcasting ==");
	    Vehicle v1=new Car();
	    System.out.println(v1.a);
	    System.out.println(v1.b);
	    
	    //it is downcasting 
	    System.out.println("=============by using downCasting====");
	    Car c2=(Car)v1;
	    System.out.println(c2.a);
	    System.out.println(c2.b);
	    System.out.println(c2.x);
	    System.out.println(c2.y);
	    
	    
	    

	    System.out.println("==========it is simple way===");
	    Car c1 =new Car();
	    
	    System.out.println(c1.a);
	}
}
