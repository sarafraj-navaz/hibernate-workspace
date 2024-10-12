package number_Based_Programming0;

import java.util.Scanner;

public class Find_HCF_Number_Program33 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number ");
		int n2=sc.nextInt();
		System.out.println("enter the third number ");
		int n3 =sc.nextInt();
		getHCFNumber(n1, n2, n3);
	}
	public static void getHCFNumber(int n1,int n2,int n3) {
		int hcf=1;
		for(int i=2;i<=getSmallestNumber(n1,n2,n3)/2;i++) {
			if(n1%i==0 && n2%i==0 && n3%i==0) {
				hcf=i;
			}
		}
		System.out.println("Hcf is "+hcf);
	}
	public static int getSmallestNumber(int n1,int n2,int n3) {
		int min=0;
		if(n1<n2 && n1<n3)
			min=n1;
		else if(n2<n1 && n2<n3) 
			min=n2;
		else
			min=n3;
	return min;	
	}
}
