package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Test24 {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,6};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the element which wants to insert into array");
		int n=sc.nextInt();
		System.out.println("enter the position of the which position you want to insert ");
		int p=sc.nextInt();
		getInsert(a,n,p);
	}
	public static void getInsert(int[] a,int n,int p) {
		int[] b=new int[a.length+1];
		for(int i=0;i<a.length;i++) {
			if(i<p-1)
				b[i]=a[i];
			else if(i==p-1) {
				int temp=a[i];
				b[i]=p;
				b[i+1]=temp;
			}
			else
				b[i+1]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
