package interface_deep_understanding_heirarchy;

public class F_DriverClass {

	public static void main(String[] args) {
		
//		here load every method but we can access A interface only method
		
		A a =new F();
		a.test();// At the compile it will connect A interface abstract method but 
		// at the run time it will execute according odject creation 
		
		C c =(C)a;
		c.start();// At the compile it will connect C interface abstract method but 
		// at the run time it will execute according odject creation 
		
		E e =(E)a;// At the compile it will connect E interface abstract method but 
		// at the run time it will execute according odject creation as well as we can access 
		// all method becaouse it is last child interface of all interface
		
		e.test();
		e.start();
		e.run();
		e.demo();
		e.drive();
		e.display();
	     A.static_display();
		
	}

}
