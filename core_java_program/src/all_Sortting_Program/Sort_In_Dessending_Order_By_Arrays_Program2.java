package all_Sortting_Program;

import java.util.Arrays;
import java.util.Collections;

public class Sort_In_Dessending_Order_By_Arrays_Program2 {
	public static void main(String[] args) {
		Integer[] a = { 13, 7, 6, 45, 21, 9, 2, 100 };
		sortDesendingOrder(a);
		System.out.println(Arrays.toString(a));
//		System.out.print("[");
//		for(int a1:a) {
//			System.out.print(a1+" ,");
//		}
//		System.out.print("]");
	}
	public static Integer[] sortDesendingOrder(Integer[] a) {
		Arrays.sort(a,Collections.reverseOrder());
		return a;
	}
}
