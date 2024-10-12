package number_Based_Programming0;

import java.util.Scanner;

public class ArmStrong_number_Print_1_to_100_Program28 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number as for as you want to take");
		int last =sc.nextInt();
		int totalCount=0;
		for(int i=1;i<=last;i++) {
			if(getArmStrongNumber(i)) {
				totalCount++;
				System.out.println("Armstrong number "+i);
			}
		}
		System.out.println("total armstrong number  are :"+totalCount);
	}
	public static boolean getArmStrongNumber(int n) {
		int sum=0,a1=n;
		while(n>0) {
			int rem=n%10;
			sum =sum+(int)(Math.pow(rem,getTotalDigit(a1)));
			n=n/10;
		}
		if(a1 != sum) {
			return false;
		}
	return true;	
	}
	public static int getTotalDigit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
	return count++;	
	}
}
