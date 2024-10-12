package array_all_Program;

import java.util.Scanner;

public class Print_even_add_element {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		//by using for loop
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.println("even number "+a[i]+" "+"at index "+i);
			else
				System.out.println("odd number "+a[i]+" "+"at index "+i);
		}
		System.out.println("==================");
		for(int a1:a) {
			if(a1%2==0)
				System.out.println("even number "+a1);
			else
				System.out.println("odd number "+a1);
		}
	}
}
