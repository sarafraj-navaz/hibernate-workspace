package array_all_Program;

import java.util.Scanner;

public class Sort_Element_in_Descending_Order_Program21 {
	public static void main(String[] args) {
//		int[] a= {1,2,1,3,5,6,7};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position :"+(i+1));
			a[i]=sc.nextInt();
		}
		a=sortDesendingOrder(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[] sortDesendingOrder(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	return a;	
	}
}
