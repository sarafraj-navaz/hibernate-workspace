package number_Based_Programming0;

import java.util.Scanner;

public class Check_Strong_number_Program25 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number  ");
		int n=sc.nextInt();
		if(getStrongNumber(n)) {
			System.out.println("Strong number "+n);
		}else {
			System.out.println("Not Strong number "+n);
		}
	}
	public static boolean getStrongNumber(int n) {
		int sum=0;
		int a=n;
		while(n>0) {
			int rem=n%10;
			sum =sum+getFactorialNumber(rem);
			System.out.println("sum is "+sum);
			n=n/10;
		}
		if(a!=sum) {
			return false;
		}
	return true;	
	}
	public static int getFactorialNumber(int n) {
		int pow=1;
		for(int i=1;i<=n;i++) {
			pow =pow*i;
		}
	 return pow;	
	}
}
