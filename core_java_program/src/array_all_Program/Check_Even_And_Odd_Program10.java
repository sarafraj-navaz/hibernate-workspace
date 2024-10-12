package array_all_Program;

import java.util.Scanner;

public class Check_Even_And_Odd_Program10 {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		String[] s1= {"even","odd"};
//		for(int i=0;i<n;i++) {
//			System.out.println("enter the element at position "+(i+1));
//			a[i]=sc.nextInt();
//		}
		int[] a= {12,24,31,10};
		String[] s1= {"even","odd"};
		checkEvenAndOdd(a,s1,a.length);
	}
	public static void checkEvenAndOdd(int[] a,String[] s1,int n) {
		for(int i=0;i<n;i++) {
			int n1=a[i]%2;
			System.out.println("Remender  "+n1);
			System.out.println(s1[n1]);
		}
	}
}
