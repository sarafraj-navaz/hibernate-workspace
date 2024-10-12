package number_Based_Programming0;

import java.util.Scanner;

public class Check_Disarium_Number_1_100_Progarm18 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the limit till now you want to check disarium number");
		int n=sc.nextInt(),totalCount=0;
		for(int i=100;i<=n;i++) {
			if(getDisariumNumber(i)) {
				totalCount++;
				System.out.println("Disarium number "+i);
			}
		}
		System.out.println("Total disarium number "+totalCount);
	}
	public static boolean getDisariumNumber(int n) {
//		int a=n;
//		int a1=a;
//		int sum=0;
//		int count=0;
		int a=n,a1=n,sum=0,count=0;
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
