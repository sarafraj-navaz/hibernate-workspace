package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Delete_element_at_given_Position_Program25 {
	public static void main(String[] args) {
		int[] a= {25,34,12,45,23,28};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the index ");
		int i=sc.nextInt();
		System.out.println("enter the values ");
		int n=sc.nextInt();
		System.out.println(Arrays.toString(deleteArray(a,i,n)));
	}
	public static int[] deleteArray(int[] a,int j,int n) {
		int len=a.length-1;
		int[] b=new int[len];
		for(int i=0;i<a.length;i++) {
			if(i<j)
				b[i]=a[i];
			else if(i==j){
				b[i]=a[i+1];
			}
			else {
				b[i-1]=a[i];
			}
		}
	return b;	
	}
}
