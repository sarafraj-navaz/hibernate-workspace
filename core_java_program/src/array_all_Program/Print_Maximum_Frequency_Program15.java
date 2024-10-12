package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Maximum_Frequency_Program15 {
	public static void main(String[] args) {
		int[] a= {1,3,2,2,3,3};
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter the element at  position "+(i+1));
//			a[i]=sc.nextInt();
//			
//		}
		getMaximumFrequency(a);
//        System.out.println("Maximum frequency "+getMaximumFrequency(a));
	}
	public static int[] getLinearArrays(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	return a;	
	}
	public static void getMaximumFrequency(int[] a) {
		int[] b=getLinearArrays(a);
		int maxCount=Integer.MIN_VALUE,maxValue=Integer.MIN_VALUE;
//		System.out.println(Arrays.toString(b));
		for(int i=0;i<b.length;i++) {
			int count=1;
			for(int j=0;j<b.length;j++) {
				if(i!=j && a[i]==a[j])
					count++;
			}
		if(count>maxCount) {
			maxCount=count;
			maxValue=a[i];
		}
		}
	System.out.println("Max Value "+maxValue+" frequency "+maxCount);	
	}
}
