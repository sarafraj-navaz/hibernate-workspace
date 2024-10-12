package number_Based_Programming0;

import java.util.Scanner;

public class Convert_Decimal_to_Binary_Program11 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the decimal number");
		int n=sc.nextInt();
		String s1=getBinaryFromDecimal(n);
		System.out.println(n+"Binary number is "+s1);
	}

	public static String getBinaryFromDecimal(int n) {
		String s1="";
		while(n>0) {
			int rem=n%2;
			System.out.println("rem "+rem);
			s1=rem+s1;
			System.out.println("String  "+s1);
			n=n/2;
		}
	return s1;	
	}
}
