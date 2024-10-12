package pattern;

import java.util.Scanner;

public class Square_Hellow_Pattern {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the row number of the square hellow pattern ");
////		int row=sc.nextInt();
		int n=6,m=5;
//		System.out.println("enter the column number of the square hellow pattern");
//		int col=sc.nextInt();
		
		square_Hellow_Pattern(n,m);
	}
	public static void square_Hellow_Pattern(int n,int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1||i==n||j==m) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println("");	
		}
	}
}
