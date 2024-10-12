package number_Based_Programming0;

import java.util.Scanner;

public class Covert_Decimal_to_hexaDecimal_Program15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number in the form of the Decimal");
		int n=sc.nextInt();
		String s1=getHexadecimalFromDecimal(n);
		System.out.println(n+"  Hexadecimal number is "+s1);
		
	}
	public static String getHexadecimalFromDecimal(int n) {
		String s1="";
		while(n>0) {
			int rem=n%16;
			if(rem<=9) {
				s1=rem+s1;
			}
			else if(rem>=10 && rem<=15) {
				char c1=(char)(rem+55);
				s1=c1+s1;	
			}
		n=n/16;	
		}
	return s1;	
	}
}
