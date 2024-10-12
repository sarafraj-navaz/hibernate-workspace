package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Right_to_left_Program34 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the position");
		int k=sc.nextInt();
		rotateRightToLeft(a,k);
	}
	public static void rotateRightToLeft(int[] a,int k) {
		int n=a.length-1;
		for(int i=1;i<=k;i++) {
			int x=a[0];
			for(int j=1;j<=n;j++) {
				a[j-1]=a[j];
			}
			a[n]=x;
		}
	System.out.println(Arrays.toString(a));	
	}
	
}
