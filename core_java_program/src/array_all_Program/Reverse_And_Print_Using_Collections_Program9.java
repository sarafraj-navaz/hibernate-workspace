package array_all_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_And_Print_Using_Collections_Program9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		Integer[] a=new Integer[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getReverseByCollection(a);
	}
	public static void getReverseByCollection(Integer[] a) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
}
