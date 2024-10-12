package pattern;

import java.util.Scanner;

public class Hellow_Triangle {
	public static void print_Pattern(int n) {
		int n1=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			n1=(2*i)-1;
			for(int j=1;j<=n1;j++) {
				if(i==1||j==1||n1==j||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
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
