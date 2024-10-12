package number_Based_Programming0;

import java.util.Scanner;

public class Count_Biggest_And_Smallest_Number_Program3 {

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter the digit of the number");
	   int  n=sc.nextInt();
		getBiggestAndSmallest(n);
		
	}
	public static void getBiggestAndSmallest(int n) {
		
		int a=n;
		int bigg =Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		
		while(n>0) {
			int rem =n%10;
			if(bigg<rem) {
				bigg =rem;
			}
			else if(small>rem) {
				small =rem;
			}
		n=n/10;	
		}
	if(a!=0) {
		System.out.println("Biggest is :"+bigg);
		System.out.println("smallest is :"+small);
	}
	else {
		System.out.println("Biggest and smallest is :"+0);
	}
  }

}
