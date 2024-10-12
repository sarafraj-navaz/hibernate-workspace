package number_Based_Programming0;

import java.util.Scanner;

public class Convert_Binary_to_decimal_using_Loop_Program12 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number in the form of the binary");
		int n=sc.nextInt();
		int n1= getDecimalFromBinary(n);
		System.out.println(n +" decimal is "+n1);
	}
	public static int getDecimalFromBinary(int n) {
		int sum=0;
		int pow=1;
		while(n>0) {
			int rem=n%10;
			if(rem==1) {
				sum=sum+pow;
			}
			pow=pow*2;
			System.out.println("power is "+pow);
			
			n=n/10;
		}
		return sum;
	}

}
