package array_all_Program;

import java.util.Scanner;

public class Shift_0_1_2_Program19 {
	public static void main(String[] args) {
//		int[] a= {0,2,0,1,2,1,0,2};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the element at position "+(i+1));
			a[i]=sc.nextInt();
		}
		shift_0_And_1_And_2_left_And_Right_2_Right(a);
	}
	public static void shift_0_And_1_And_2_left_And_Right_2_Right(int[] a) {
		int count0=0,count1=0,count2=0;
		for(int a1:a) {
			if(a1==0)
				count0++;
			else if(a1==1)
				count1++;
			else
				count2++;
		}
		System.out.println("Count0 :"+count0 +"\ncount1 :"+count1+"\ncount2 :"+count2);
		
		for(int i=a.length-1;i>=0;i--) {
			if(i>=(count0+count1))
				a[i]=2;
			else if((i<(count0+count1))  && i>count1) {
				a[i]=1;
			}
			else
				a[i]=0;
				
		}
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
}
