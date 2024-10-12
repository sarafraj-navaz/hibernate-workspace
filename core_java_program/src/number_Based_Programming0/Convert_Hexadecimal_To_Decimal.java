package number_Based_Programming0;

import java.util.Scanner;

public class Convert_Hexadecimal_To_Decimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String in the form of the Hexadecimal");
		String s1=sc.next();
		int n=getDecimalFromHexaDecimal(s1);
		System.out.println(s1+" Decimal is "+n);
		
	}
	public static int getDecimalFromHexaDecimal(String s1) {
		int sum=0;
		int n=s1.length();
		int pow=1;
		for(int i=n-1;i>=0;i--) {
			char c1 =s1.charAt(i);
			
			if(c1>=48 && c1<=57) {
				sum=sum+(c1-48)*pow;
			}
			else if(c1>=65 && c1<=70) {
				sum=sum+(c1-55)*pow;
			}
			else if(c1>=97 && c1<=122) {
				sum=sum+(c1-87)*pow;
			}
			else {
				System.out.println("you have entered wrong number");
				break;
			}
		pow =pow*16;	
		}
		return sum;
	}
}
