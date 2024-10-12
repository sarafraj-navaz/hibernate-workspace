package number_Based_Programming0;

import java.util.Scanner;

public class Convert_Binary_to_decimal_using_while_Loop_Program12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=getDecimalFromBinary(n);
		System.out.println(n+"  decimal number is "+n1);
	}
	public static int getDecimalFromBinary(int a) {
		int sum=0;
		int count=0;
		
		
		while(a>0) {
			int rem=a%10;
			sum=sum+rem*(int)(Math.pow(2,count));
			System.out.println("sum "+sum);
			count++;
			a=a/10;
		}
		return sum;
	}
}
