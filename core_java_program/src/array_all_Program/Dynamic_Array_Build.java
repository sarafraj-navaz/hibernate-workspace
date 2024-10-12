package array_all_Program;

import java.util.Scanner;

public class Dynamic_Array_Build {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
//		int n=sc.nextInt();
		int n;
		int[] a=new int[n=sc.nextInt()];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		
//		by using for loop
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("==============");
		//by using for each loop
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
}
