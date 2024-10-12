package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_And_Print_Using_Swap_Program9 {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n; int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter the element at position "+(i+1));
//			a[i]=sc.nextInt();
//		}
		int[] a= {5,4,3,2,1,0};
		getReverse(a);
		System.out.println(Arrays.toString(a));
	}
	public static void getReverse(int[] a) {
		int n=a.length;
		for(int i=0;i<n/2;i++) {
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		
//		for(int a1:a) {
//			System.out.println(a1);
//		}
	}
}
