package number_Based_Programming0;

public class Print_Right_to_Left_each_Digit_Program6 {

	public static void main(String[] args) {
		int n=234;
		printRightToLeft(n);
		
	}
	public static void printRightToLeft(int n) {
		while(n>0) {
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
		
	}
}
