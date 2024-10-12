package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_element_at_Position_Program24 {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,6};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the index ");
		int i=sc.nextInt();
		System.out.println("enter the values ");
		int n=sc.nextInt();
		System.out.println(Arrays.toString(insertArray(a,i,n)));
		a=insertArray(a,i,n);
	}
	public static int[] insertArray(int[] a,int j,int n) {
		int len=a.length+1;
		int[] b=new int[len];
		for(int i=0;i<a.length;i++) {
			if(i<j) {
				b[i]=a[i];
			}
			else if(i==j) {
				b[i+1]=a[i];
				b[i]=n;
			}	
			else {
				b[i+1]=a[i];
			}
		}
		a=b;
	return b;	
	}
	
}
