package number_Based_Programming0;

import java.util.Scanner;

public class Check_Disarium_Number_Program17 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the number");
		int n=sc.nextInt();
		if(getDisariumNumber(n)) {
			System.out.println("Disarium number "+n);
		}
		else {
			System.out.println("not disarium number  :"+n);
		}	
	}
	public static boolean getDisariumNumber(int n) {
		int a=n;
		int a1=a;
		int sum=0;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		while(a>0) {
			int rem=a%10;
			sum=sum+(int)(Math.pow(rem,count));
			count--;
			a=a/10;
		}
	   	if(a1!=sum) {
	   		return false;
	   	}
	  return true;
	}
}
