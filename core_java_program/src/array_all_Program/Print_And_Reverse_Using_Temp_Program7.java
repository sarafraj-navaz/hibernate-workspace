package array_all_Program;

import java.util.Scanner;

public class Print_And_Reverse_Using_Temp_Program7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getReverseUsingTemp(a,n);
	}
	public static void getReverseUsingTemp(int[] a,int n) {
		int t,k;
		for(int i=0;i<n/2;i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		for(k=0;k<n;k++) {
			System.out.println(a[k]);
		}
	}
}
