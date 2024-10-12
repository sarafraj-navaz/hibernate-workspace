package array_all_Program;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		getB(a);
		System.out.println("after bubble "+Arrays.toString(a));
	}
	public static void getB(int[] a) {
		int n=a.length-1;
		for(int i=0;i<=n;i++) {
			int count=0;
			for(int j=0;j<(n-i);j++) {
				if(a[j]>a[j+1]) {
					count++;
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			if(count==0)
				return;
			}
		}
	}
}
