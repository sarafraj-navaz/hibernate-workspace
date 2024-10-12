package number_Based_Programming0;

import java.util.Scanner;

public class Prime_Number_Program29 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		if(getPrimeNumber(n)) {
			System.out.println("Prim number  "+n);
		}
		else {
			System.out.println("not prime "+n);
		}
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
