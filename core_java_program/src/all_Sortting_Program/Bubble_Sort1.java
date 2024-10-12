package all_Sortting_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort1 {
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the arrays");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<n;i++) {
//			System.out.println("enter the element at position "+(i+1));
//			a[i]=sc.nextInt();
//		}
//		for(int a1:a) {
//			System.out.print(a1+" ");
//		}
		a=sortByUsingBubble(a);
		System.out.println(Arrays.toString(a));
	}
	public static int[] sortByUsingBubble(int[]  a) {
		int n=a.length-1;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					count++;
				}
			}
		if(count==0)
			break;
		}
	return a;	
	}
}
