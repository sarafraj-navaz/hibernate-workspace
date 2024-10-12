package array_all_Program;

import java.util.Scanner;

public class Print_3_digit_Number_Only {
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
		for(int a1:a) {
			int count=0,n=a1;
			while(a1>0) {
				count++;
				a1=a1/10;
			}
			if(count ==3) {
				System.out.println("3 Digit number "+n);
			}
			
		}
	}

}
