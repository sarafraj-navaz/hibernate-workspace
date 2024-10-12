package deepCopy_mechanism;

public class ADriver {

	public static void main(String[] args) {
		
		/*
		 * when one object refrence is chaning the details and it is not reflected to
		 * another object refrence then such copy is called deep copy
		 */
		
		A a1 =new A(12);
		
		A a2 =new A(23);
		
		a1.aa=21;
		a2.aa=22;
	}

}
