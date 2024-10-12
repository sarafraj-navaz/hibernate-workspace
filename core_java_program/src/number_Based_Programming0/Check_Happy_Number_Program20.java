package number_Based_Programming0;

import java.util.Scanner;

public class Check_Happy_Number_Program20 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last number");
		int last=sc.nextInt();
		int totalCount=0;
		for(int i=1;i<=last;i++) {
			if(checkHappyNummber(i)) {
				totalCount++;
				System.out.println("Happy number  "+i);
			}
		}
		System.out.println("Total count :"+totalCount);	
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
