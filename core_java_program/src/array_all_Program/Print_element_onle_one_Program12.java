package array_all_Program;

import java.util.Scanner;

public class Print_element_onle_one_Program12 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,2,4,2,5,4,3,2};
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter the element at position "+(i+1));
//			a[i]=sc.nextInt();
//		}
		getFrequency(a);
	}
	public static void getFrequency(int[] a) {
		int n=a.length-1;
		for(int i=0;i<=n;i++) {
			int count=1;
			for(int j=i+1;j<=n;j++) {
				if(a[i]==a[j]) {
					a[j]=a[n];
					count++;
					j--;
					n--;
				}
			}
			if(count==1) {
				System.out.println(a[i]+" frequency "+count);
			}
		}
	}
}
