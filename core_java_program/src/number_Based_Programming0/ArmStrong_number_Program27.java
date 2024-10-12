package number_Based_Programming0;

import java.util.Scanner;

public class ArmStrong_number_Program27 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		if(getArmstrongNumber(n)) {
			System.out.println("Armstrong number "+n);
		}
		else {
			System.out.println("Not armstrong number "+n);
		}
	}
	public static boolean getArmstrongNumber(int n) {
		int a=n,a1=n,sum=0;
		while(a>0) {
			int rem=a%10;
			sum=sum+(int)(Math.pow(rem,getCountDigit(n)));
			System.out.println("sum is "+sum);
			a=a/10;
		}
		if(a1!=sum) {
			return false;
		}
	return true;	
	}
	public static int getCountDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
	return count;	
	}
}
