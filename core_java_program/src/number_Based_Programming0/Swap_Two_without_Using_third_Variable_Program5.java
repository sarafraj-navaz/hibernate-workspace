package number_Based_Programming0;

import java.util.Scanner;

public class Swap_Two_without_Using_third_Variable_Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		getSwapTwoNumber(a, b);

	}
	public static void getSwapTwoNumber(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after the swapping is ");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
	}
}
