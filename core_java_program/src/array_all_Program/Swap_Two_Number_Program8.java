package array_all_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Swap_Two_Number_Program8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		Integer[] a=new Integer[n=sc.nextInt()];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("enter  the first number ");
		int i=sc.nextInt();
		System.out.println("enter the second number");
		int j=sc.nextInt();
		getSwapTwoNumber(a,i,j);
	}
	public static void getSwapTwoNumber(Integer[] a,int n1,int n2) {
		Collections.swap(Arrays.asList(a), n1, n2);
		System.out.println(Arrays.asList(a));
	}
}
