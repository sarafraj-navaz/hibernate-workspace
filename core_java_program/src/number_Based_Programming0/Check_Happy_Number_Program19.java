package number_Based_Programming0;

import java.util.Scanner;

public class Check_Happy_Number_Program19 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number that number should be greater than 9");
		int n=sc.nextInt();
		if(checkHappyNummber(n)) {
			System.out.println("Happy number  "+n);
		}
		else {
			System.out.println(" not Happy number  "+n);
		}
		
	}
	
	public static boolean checkHappyNummber(int n) {
		int a1=n,count=0;
		while(a1>0) {
			count++;
			a1=a1/10;
		}
		while(n>9) {
			int sum=0;
			while(n>0) {
				int rem=n%10;
				sum=sum+(int)(Math.pow(rem,count));
				n=n/10;
			}
			n=sum;
		}
	  if(n != 1 && n!=7) {
		  return false;
	  }
	 return true;
	}
}
