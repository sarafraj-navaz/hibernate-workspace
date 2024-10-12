package pattern;

import java.util.Scanner;

public class Number_Triangular_Without_Column {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the end of the row");
		int row=sc.nextInt();
		print_Number_triangular_Pattern(row);
	}
	public static void print_Number_triangular_Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=(5-i);j<(n+i);j++) {
				if((i+j)%2==0) {
					System.out.print(" ");
				}else {
					System.out.print(i);
				}
			}
		System.out.println();	
		}
		int n1=n;
		int a=1;
		for(int i=4;i>1;i--) {
			for(int j=0;j<=(n-i);j++) {
				System.out.print(" ");
			}
			n1=n1-1;
			a=a+1;
			for(int j=a;j<=(n*2)-a;j++) {
				if((i+j)%2==0) {
					System.out.print(n1);
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println("");	
		}
	}
}
