package array_all_Program;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Element_in_Descending_Order_By_Collections_Program21 {

	public static void main(String[] args) {
		Integer[] a= {1,2,1,3,5,6,7};
		a=getSortDescendingOrder(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static Integer[] getSortDescendingOrder(Integer[] a) {
	     Collections.reverse(Arrays.asList(a));
		return a;
	}
}
