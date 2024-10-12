package array_all_Program;

import java.util.Arrays;
import java.util.Collections;

public class Test20 {
	public static void main(String[] args) {
		int[] a= {1,2,1,3,5,6,7};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					a[j]=a[j]+a[j+1];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
