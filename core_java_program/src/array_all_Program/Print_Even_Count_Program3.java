package array_all_Program;

import java.util.Scanner;

public class Print_Even_Count_Program3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getEvenNumber(a);
	}
	public static void getEvenNumber(int[] a) {
		int totalCount=0;
		for(int a1:a) {
			if(a1%2==0) {
				totalCount++;
				System.out.println("even number "+a1);
			}	
		}
	System.out.println("Total even number : "+totalCount);	
	}
}
