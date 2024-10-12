package array_all_Program;

import java.util.Scanner;

public class Print_And_Reverse_Program7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position :"+(i+1));
			a[i]=sc.nextInt();
		}
	     getReverse(a);
	}
	public static void getReverse(int[] a) {
		int n=a.length;
		int[] a1=new int[n];
		for(int i=0;i<n;i++) {
			a1[i]=a[n-i-1];
		}
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}	
	}
}
