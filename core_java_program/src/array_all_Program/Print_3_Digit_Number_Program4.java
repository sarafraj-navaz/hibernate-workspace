package array_all_Program;

import java.util.Scanner;

public class Print_3_Digit_Number_Program4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		print3DigitNumber(a);
	}
	public static void print3DigitNumber(int[] a) {
		int totalCount=0;
		for(int a1:a) {
			int a2=a1;
			int  count=0;
			while(a1>0) {
				count++;
				a1=a1/10;
			}
		if(count==3) {
			totalCount++;
			System.out.println(a2);
		}
		}
	System.out.println("Total 3 digit of the number  "+totalCount);	
	}
}
