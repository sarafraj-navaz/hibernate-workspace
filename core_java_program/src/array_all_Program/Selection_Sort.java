package array_all_Program;

import java.util.Arrays;

public class Selection_Sort {
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		getSelectionSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	public static void getSelectionSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}	
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
}
