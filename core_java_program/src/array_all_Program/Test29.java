package array_all_Program;

import java.util.Arrays;

public class Test29 {
	public static void main(String[] args) {
//		int[] a= {1,2,3,3,2,1};
		int[] a= {1,2,3,4,5};
		if(isLeftAndRight_Element_Same(a)) {
			System.out.println("Left and Right All Element is same "+Arrays.toString(a));
		}
		else {
			System.out.println("left and Right all element is not same "+Arrays.toString(a));
		}
	}
	public static boolean isLeftAndRight_Element_Same(int[] a) {
		for(int i=0;i<a.length/2;i++) {
			if(a[i]!=a[a.length-1-i])
				return false;
		}
		return true;
	}
}
