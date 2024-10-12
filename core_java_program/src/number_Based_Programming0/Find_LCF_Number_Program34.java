package number_Based_Programming0;

import java.util.Scanner;

public class Find_LCF_Number_Program34 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number ");
		int n2=sc.nextInt();
		System.out.println("enter the third number ");
		int n3 =sc.nextInt();
		getLCFNumber(n1, n2, n3);
	}
	public static  int gettHCFNumber(int n1,int n2,int n3) {
		int hcf=1;
		for(int i=2;i<=getSmallestNumber(n1,n2,n3)/2;i++) {
			if(n1%i==0 && n2%i==0 && n3%i==0) {
				hcf=i;
			}
		}
	   return hcf;
	}
	public static void getLCFNumber(int n1,int n2,int n3) {
		   int lcf =(n1*n2*n3)/gettHCFNumber(n1, n2, n3);
		   int pro =(n1*n2*n3);
		   int result =lcf*gettHCFNumber(n1, n2, n3);
		   if(result ==pro) {
			   System.out.println("HCF number  "+gettHCFNumber(n1, n2, n3));
			   System.out.println("LCF number "+lcf);
		   }
		   
	}
	public static int getSmallestNumber(int n1,int n2,int n3) {
		int min=0;
		if(n1<n2 && n1<n3) {
			min=n1;
		}
		else if(n2<n1 && n2<n3) {
			min=n2;
		}
		else {
			min=n3;
		}
	return min;	
	}
}
