package all_Sortting_Program;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {5,4,1,2,3};
		System.out.println(Arrays.toString(a));
		 a=getInsertionSort(a);
		 System.out.println(Arrays.toString(a));
	}
	public static int[] getInsertionSort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int curr=a[i];
			int prev=i-1;
			// to arrange 
			while(prev>=0 && a[prev]>curr) {
				a[prev+1]=a[prev];
				prev--;
			}
			//To insert 
			a[prev+1]=curr;
		}
	return a;	
	}
}
