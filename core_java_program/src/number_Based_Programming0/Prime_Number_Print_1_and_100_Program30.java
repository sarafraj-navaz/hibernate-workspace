package number_Based_Programming0;

import java.util.Scanner;

public class Prime_Number_Print_1_and_100_Program30 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last number as for as  you want to take");
		int last=sc.nextInt();
		int totalCount=0;
		for(int i=1;i<=last;i++) {
			if(getPrimeNumber(i)) {
				System.out.println("Prim number "+i);
			}
		}
	System.out.println("Total prime number are "+totalCount);	
	}
	public static boolean getPrimeNumber(int n) {
		if(n==1 || n==2) {
			return true;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
	return true;	
	}
}
