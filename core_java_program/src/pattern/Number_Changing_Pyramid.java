package pattern;

import java.util.Scanner;

public class Number_Changing_Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the end of row");
		int n=sc.nextInt();
		print_Number_Changing_Pyramid(n);
	}
	public static void print_Number_Changing_Pyramid(int n) {
		int n1=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				n1=n1+1;
				System.out.print(n1);
			}
		System.out.println(" ");	
		}
	}
}
