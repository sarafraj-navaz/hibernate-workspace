package all_Sortting_Program;

import java.util.Arrays;

public class Sort_In_Assending_Order_By_Arrays_Program1 {
	public static void main(String[] args) {
		int[] a = { 13, 7, 6, 45, 21, 9, 2, 100 };
		sortAscendingOder(a);
//		for(int a1:a) {
//			System.out.print(a1+" ");
//		}
		System.out.println(Arrays.toString(a));
	}
	public static int[] sortAscendingOder(int[] a) {
		Arrays.sort(a);
		return a;
	}
}
