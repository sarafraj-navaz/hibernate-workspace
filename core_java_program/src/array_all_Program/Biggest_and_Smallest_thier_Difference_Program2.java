package array_all_Program;

import java.util.Scanner;

public class Biggest_and_Smallest_thier_Difference_Program2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		int[] a =new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		getBiggestAndSmallestNumber(a);
	}
	public static void getBiggestAndSmallestNumber(int[] a) {
		int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
		int maxIndex=0,minIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {	
				max=a[i];
				maxIndex=i;
			}
			if(a[i]<min) {
				min=a[i];
				minIndex=i;
				
			}
		}
		System.out.println("Biggest number of the array : "+max);
		System.out.println("Smallest number of the array  :"+min);
		int difference=maxIndex-minIndex;
		if(difference<0) {
			//here if my difference results negative number then 
			//I am Multiplying - (minus operator )Then That number becomes position number
			difference=-(difference);
			System.out.println("Difference biitween them is "+difference);
		}
		else {
			System.out.println("Difference biitween them is "+difference);
		}
	}
}
