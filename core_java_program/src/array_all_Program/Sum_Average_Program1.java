package array_all_Program;

import java.util.Scanner;

public class Sum_Average_Program1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("average of the element of the array"+getAverage(a));
	}
	public static int getAverage(int[] a) {
		int sum=0,count=0;
		for(int i=0;i<a.length;i++) {
			count++;
			sum=sum+a[i];
		}
		System.out.println("total number is "+count);
		int average=sum/count;
		System.out.println("total sum of the array"+sum);
	return average;
	}
}
