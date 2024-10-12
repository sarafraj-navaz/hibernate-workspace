package number_Based_Programming0;

import java.util.Scanner;

public class Combination_Program37 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the total seat of the Collage");
		int n=sc.nextInt();
		System.out.println("enter the boy's number  ");
		int r=sc.nextInt();
		
		System.out.println("Total combination of  the student :"+getCombination(n, r));
		
	}
	public static int getPermutation(int n,int r) {
		
		int n1=getFactorial(n),r1=getFactorial(n-r),totalArrangement =n1/r1;
	return totalArrangement;
	}
	public static int getFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(n+" factorial "+fact);
	return fact;	
	}
	
	public static int getCombination(int n,int r) {
	  int combonation=((getPermutation(n, r))/(getFactorial(r)));
	  return combonation;
	}
}
