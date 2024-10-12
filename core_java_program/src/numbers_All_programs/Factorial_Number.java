package numbers_All_programs;

public class Factorial_Number {
	public static void main(String[] args) {
		int  n=5;
		getFactorial(n);
	}
	public static void getFactorial(int n) {
		int pow=1;
		for(int i=1;i<=n;i++) {
			pow=pow*i;
		}
	System.out.println("Factorial number "+pow);	
	}
}
