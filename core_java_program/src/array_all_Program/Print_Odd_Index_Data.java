package array_all_Program;

import java.util.Scanner;

public class Print_Odd_Index_Data {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a =new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position :"+(i+1));
			a[i]=sc.nextInt();
		}
		//by using for loop
		for(int i=0;i<a.length;i++) {
			if(i%2==0)
				System.out.print(a[i]+" ");
		}
	}
}
