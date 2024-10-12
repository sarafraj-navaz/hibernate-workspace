package array_all_Program;

import java.util.Arrays;

public class Test30ButLeetCode283 {
	public static void main(String[] args) {
		int[] a= {7,0,2,6,0,4};	
		System.out.println(Arrays.toString(afterShiftedArray(a)));
		
	}
	public static int[] afterShiftedArray(int[] a) {
		int j=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				a[j++]=a[i];
			}
		}
		while(j<a.length){
			a[j++]=0;
		
		}
	return a;	
	}

}
