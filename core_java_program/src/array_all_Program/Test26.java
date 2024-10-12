package array_all_Program;

import java.util.Arrays;

public class Test26 {
	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,4,5};
		getcountUniquiElement(a);
	}
	public static void getcountUniquiElement(int[] a) {
		int n=a.length-1;
		System.out.println();
		for(int i=0;i<=n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					a[j--]=a[n--];
				}
			}
		}
		System.out.println("size of the current length"+n);
//		int[] b=new int[n+1];
//		for(int i=0;i<b.length;i++) {
//			b[i]=a[i];
//		}
		int[] b = Arrays.copyOf(a, n+1);
	System.out.println("Uniqui Array "+Arrays.toString(b));	
	}
}
