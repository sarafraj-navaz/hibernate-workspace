package array_all_Program;

import java.util.Arrays;

public class First_Half_Assending_Second_Second_Half_desending_Program22 {
	public static void main(String[] args) {
		int[] a= {25,34,12,45,23,28};
		System.out.println(Arrays.toString(sortFirstAndSecondHalf(a)));
	}
	public static int[] sortFirstAndSecondHalf(int[] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			int n1=n/2;
			if(i<n1) {
				for(int j=i+1;j<n1;j++) {
					if(a[i]>a[j]) {
						int t=a[j];
						a[j]=a[i];
						a[i]=t;
					}
				}
			}
			else {
				for(int j=i+1;j<n;j++) {
					if(a[i]<a[j]) {
						int temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}
			}
		}
	return a;	
	}
	
}
