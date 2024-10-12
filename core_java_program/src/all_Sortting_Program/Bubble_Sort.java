package all_Sortting_Program;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
//		int[] a= {5,4,1,3,2};
		int[] a= {1,2,3,4,5};
		sortUsingBubbleSort(a);
	}
	public static void sortUsingBubbleSort(int[] a) {
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int count=0;
			for(int j=0;j<(n-i-1);j++) {
				if(a[j]>a[j+1]) {
					count++;
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}	
			}
			if(count==0) {
				System.out.println("All ready sort");
				break;
			}
		}
	System.out.println(Arrays.toString(a));	
	}
}
