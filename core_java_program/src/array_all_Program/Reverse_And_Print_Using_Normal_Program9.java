package array_all_Program;

import java.util.Scanner;

public class Reverse_And_Print_Using_Normal_Program9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getReverseByNormal(a,n);
	}
	public static void getReverseByNormal(int[] a,int n) {
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=a[n-i-1];
		}
		
		for(int b1:b) {
			System.out.println(b1);
		}
	}
}
