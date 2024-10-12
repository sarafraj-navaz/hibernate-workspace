package number_Based_Programming0;

import java.util.Scanner;

public class Convert_Octal_To_Decimal_Program14 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number in form of the Octal");
		int n=sc.nextInt();
		int s1=getDecimalFromOctal(n);
		System.out.println(n+" Decimal number is "+s1);
	}
	public static int getDecimalFromOctal(int n) {
		
		int sum=0;
		int pow=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*(int)(Math.pow(8,pow));
			pow++;
         	n=n/10;;
		}
	return sum;	
	}
}
