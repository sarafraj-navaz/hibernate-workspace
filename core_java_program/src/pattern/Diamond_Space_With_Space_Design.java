package pattern;

import java.util.Scanner;

public class Diamond_Space_With_Space_Design {
	public static void print_Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();	
		}
		for(int i=n;i>1;i--) {
			for(int j=1;j<=(n-i)+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("*"+" ");
			}
		System.out.println();	
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last row of the triangle");
		int n=sc.nextInt();
		print_Pattern(n);
	}
}
