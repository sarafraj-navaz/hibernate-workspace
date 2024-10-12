package array_all_Program;

import java.util.Arrays;
import java.util.Collections;

public class Sort_element_In_assending_order_By_Collection_Program20 {
	public static void main(String[] args) {
		Integer[] a= {1,2,1,3,5,6,7};
		a=getSortAscendingOrder(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static Integer[] getSortAscendingOrder(Integer[] a) {
       Collections.sort(Arrays.asList(a));
		return a;
	}
}
