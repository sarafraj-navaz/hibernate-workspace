package numbers_All_programs;

public class PrintDigitRightToLeft_Program6 {

	public static void main(String[] args) {
		printRighttoLeft(1234);
	}
	public static void printRighttoLeft(int  n) {
		while(n>0) {
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
	}

}
