package array_all_Program;

import java.util.Arrays;

public class Check_Strictly_Increasing_Arrays_Program31 {
	public static void main(String[] args) {
		int[] a= {2,3,7,8,9};
//		int[] a= {2,3,7,5,8,9};
		if(checkStrictly(a))
			System.out.println(Arrays.toString(a));
		else
			System.out.println("Not strictly arrays");
	}
	public static boolean checkStrictly(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
					return false;
			}
		}
	return true;	
	}
}
