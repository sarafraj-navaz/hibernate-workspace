package number_Based_Programming0;

import java.util.Scanner;

public class Print_Strong_Number_1_to_100_Program26 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last number as for as you want to take");
		int last  =sc.nextInt();
		int totalCount=0;
		for(int i=1;i<=last;i++) {
			if(getStrongNumber(i)) {
				totalCount++;
				System.out.println("Strong number  "+i);
			}
		}
		System.out.println("Total Strong number are "+totalCount);
	}
	
	public static boolean getStrongNumber(int n) {
		int sum=0;
		int a1=n;
		while(n>0) {
			int rem=n%10;
			sum=sum+getFactorialNumber(rem);
			n=n/10;
		}
		if(a1 != sum) {
			return false;
		}
	return true;	
	}
	public static int getFactorialNumber(int rem) {
		int pow=1;
		for(int i=1;i<=rem;i++) {
			pow =pow*i;
		}
	return pow;	
	}
}
