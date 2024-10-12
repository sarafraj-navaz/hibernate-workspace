package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_left_to_Right_Program33 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the key ");
		int k=sc.nextInt();
		getRotateLeft_to_Right(a,k);
	}
	public static void getRotateLeft_to_Right(int[] a,int k) {
		int n=a.length-1;
     for(int i=1;i<=k;i++) {
 		int x=a[n];
 		for(int j=n;j>=1;j--) {
 			a[j]=a[j-1];
 		}
 		a[0]=x;
     }
	System.out.println(Arrays.toString(a));	
	}
}
