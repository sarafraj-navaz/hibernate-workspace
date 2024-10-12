package array_all_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Print_And_Reverse_Using_Collectios_Program7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		Integer[] a=new Integer[n=sc.nextInt()];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getReverseByCollections(a);
	}
	public static void getReverseByCollections(Integer[] a) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));	
	}
}
