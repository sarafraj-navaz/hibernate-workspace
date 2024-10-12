package array_all_Program;

import java.util.Scanner;

public class Print_And_Count_7_Program0 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getDivide7(a);
	}
	public static void getDivide7(int[] a) {
		for(int a1:a) {
			if(a1%7==0)
				System.out.println(" that element divides by 7 "+ a1+" ");
		}
	}
}
