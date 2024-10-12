package array_all_Program;

import java.util.Arrays;

public class Program19_other_method {
	public static void main(String[] args) {
		int[] a= {0,2,0,1,2,1,0,2};
		a=shift(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[] shift(int[] a) {
		int count0=0,count1=0,count2=0;
		for(int a1:a) {
			if(a1==0||a1==1||a1==2) {
				if(a1==0)
					count0++;
				else if(a1==1)
					count1++;
				else
					count2++;
			}
			else {
				System.out.println("You have entered wrong array");
			}
		}
		
		int[] b=new int[a.length];
		for(int i=count0;i<a.length;i++) {
			if(i>=count0 && i<(count0+count1))
				b[i]=1;
			else
				b[i]=2;
		}
		return b;
	} 
}
