package all_Sortting_Program;

import java.util.Arrays;

public class Selection_Sort_Program1 {
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		sortByUsingSelectionSort(a);
	}
	public static void sortByUsingSelectionSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for( int j=i+1;j<n;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			System.out.println(a[min]);
		    int temp =a[i];
		    a[i]=a[min];
		    a[min]=temp;
			
		}
	System.out.println(Arrays.toString(a));	
	}
}
