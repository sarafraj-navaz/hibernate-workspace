package pattern;

import java.util.Scanner;
public class Rhombus_Pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the end of row");
		int n=sc.nextInt();
		System.out.println("enter the end of column");
		int m=sc.nextInt();
	   print_Rhombus_Pattern(n,m);	
	}	
	public static void print_Rhombus_Pattern(int n,int m) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
		System.out.println(" ");	
		}
	}
}
