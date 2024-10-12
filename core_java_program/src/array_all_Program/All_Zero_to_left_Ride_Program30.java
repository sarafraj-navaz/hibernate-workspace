package array_all_Program;

import java.util.Arrays;

public class All_Zero_to_left_Ride_Program30 {
	public static void main(String[] args) {
		int[] a= {7,0,2,6,0,4,3,2,3};
		System.out.println(Arrays.toString(shiftAllZeroInEnd(a)));
	}
	public static int[] shiftAllZeroInEnd(int[] a) {
		int count=0;
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]>-1) {
				if(a[i]>0)
					b[i-count]=a[i];
				else
					count++;
			}else
				System.out.println("you have entered wrong arrays");
		}
	return b;	
	}
}
