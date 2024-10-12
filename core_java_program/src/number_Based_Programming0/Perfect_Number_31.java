package number_Based_Programming0;

import java.util.Scanner;

public class Perfect_Number_31 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		if(getPerfectNumber(n)) {
			System.out.println("Perfect number  "+n);
		}
		else {
			System.out.println("Not perfect number "+n);
		}
	}
	public static boolean getPerfectNumber(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(n!=sum) {
			return false;
		}
	return true;	
	}
}
