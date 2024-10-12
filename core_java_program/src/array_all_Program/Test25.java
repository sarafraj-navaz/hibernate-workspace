package array_all_Program;

import java.util.Arrays;
import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		int[] a= {1,2,3,7,4,5};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the position number which position element you want to delete");
		int position=sc.nextInt();
		System.out.println("before Delete "+Arrays.toString(a));
		deleteElement(a,position);
	}
	public static void deleteElement(int[] a,int position) {
		int[] b=new int[a.length-1];
		for(int i=0;i<b.length;i++) {
			if(i<position-1)
				b[i]=a[i];
			else
				b[i]=a[i+1];
		}
		System.out.println("After delete position element "+Arrays.toString(b));
	}
}
