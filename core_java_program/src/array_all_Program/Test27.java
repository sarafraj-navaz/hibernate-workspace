package array_all_Program;

import java.util.Arrays;

public class Test27 {
	public static void main(String[] args) {
//		int[] a= {1,2,2,3,4,4,5};
		int[] a={5,4,1,3,2};
		if(getResult(a)) {
			System.out.println("All uniqui element is present"+Arrays.toString(a));
		}
		else {
			System.out.println("Doublicate element is present"+Arrays.toString(a));
		}
	}
	public static boolean getResult(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					return false;
			}
		}
	return true;	
	}
}
