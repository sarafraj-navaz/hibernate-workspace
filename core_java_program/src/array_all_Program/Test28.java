package array_all_Program;

import java.util.Arrays;

public class Test28 {
//	public static void main(String[] args) {
//		int[] a= {5,4,1,3,2};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println("Maximum product of two integer=="+getProductOfHighest_two_Number(a));
//	}
//	public static int getProductOfHighest_two_Number(int[] a) {
//		int sum=(a[a.length-1])+(a[a.length-2]);
//		return sum;
//	}
	// in other ways to solve 
	
	public static void main(String[] args) {
		int[] a= {5,4,1,3,2};
		System.out.println("Maximum product of the two integer==="+getMaximumProductOfTwoInteger(a));
	}
	public static int getMaximumProductOfTwoInteger(int[] a) {
		int max=Integer.MIN_VALUE;
		int sMax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max){
				sMax=max;
				max=a[i];
			}
			else if(a[i]<max && a[i]>sMax)
				sMax=a[i];
		}
	  System.out.println("First Maximum "+max);
	  System.out.println("Second Maximum==="+sMax);
	  int product=max*sMax;
	  return product;
	}
}
