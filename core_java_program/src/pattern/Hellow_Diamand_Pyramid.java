package pattern;

import java.util.Scanner;

public class Hellow_Diamand_Pyramid {
	public static void print_Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				if(j==1||(j==(2*i)-1))
					System.out.print("* ");
				else
					System.out.print(" ");
			}
		System.out.println();	
		}
		int i1=n-1;
		for(int i=i1;i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
					if(j==1||(j==(2*i)-1))
						System.out.print("* ");
					else
						System.out.print(" ");
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
