package shallow_copy_mechanism;

public class ADriver {

	public static void main(String[] args) {
		
		A a1 =new A();
		System.out.println(a1.x);
		
		A a2= a1;
		   a2.x=23;
		   System.out.println(a2.x);
		   
		   System.out.println(a1.x);
	}

}
