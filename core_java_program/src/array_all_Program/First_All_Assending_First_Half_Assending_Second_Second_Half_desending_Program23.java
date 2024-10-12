package array_all_Program;

import java.util.Arrays;

public class First_All_Assending_First_Half_Assending_Second_Second_Half_desending_Program23 {
	public static void main(String[] args) {
		int[] a= {25,34,12,45,23,28};
		System.out.println(Arrays.toString(sortFirstAndSecondHalf(a)));
	}
	public static int[] sortFirstAndSecondHalf(int[] a) {
		int[] b=new int[a.length];
		b=sorAssendingOrder(a);
//		System.out.println(Arrays.toString(a));
		int len=a.length/2;
		for(int  i=3;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	return b;	
	}
//	public static int[] sorAssendingOrder(int[] a) {
//		Arrays.sort(a);
//		return a;
//	}
	public static int[] sorAssendingOrder(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	return a;	
	}
}
