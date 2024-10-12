package array_all_Program;

import java.util.Scanner;

public class Print_Count_Prime_Number_Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n, totalPrime = 0;
		int[] a = new int[n = sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the element at position " + (i + 1));
			a[i] = sc.nextInt();
		}

		for (int a1 : a) {
			if (getPrimeNumber(a1)) {
				totalPrime++;
				System.out.println("Prime " + a1);
			}
		}
	}

	public static boolean getPrimeNumber(int n) {
		if (n == 1 || n == 2) {
			return true;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
