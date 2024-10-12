package rivision;

import java.util.Scanner;

public class Swapping_Two_Index_value_Program8 {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the length of the array");
//		int[] a=new int[sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			a[i]=sc.nextInt();
//		}
		int[] a= {5,4,1,3,2};
		int start=0,end=4;
		for(int a1:getFinalArray(a,start,end)) {
			System.out.print(a1+",");
		}
	}
	public static int[] getFinalArray(int[] a,int i,int j) {
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];	
	return a;			
	}
}
