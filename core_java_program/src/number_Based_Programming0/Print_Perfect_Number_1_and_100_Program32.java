package number_Based_Programming0;

import java.util.Scanner;

public class Print_Perfect_Number_1_and_100_Program32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last number as for as you want to take");
		int last = sc.nextInt();
		int totalCount = 0;
		for (int i = 1; i <= last; i++) {
			if (getPerfectNumber(i)) {
				totalCount++;
				System.out.println("Perfect Number  " + i);
			}
		}
		System.out.println("Total Perfect number " + totalCount);
	}

	public static boolean getPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n != sum) {
			return false;
		}
    return true;
	}
}
