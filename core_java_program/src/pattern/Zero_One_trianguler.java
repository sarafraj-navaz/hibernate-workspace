package pattern;

import java.util.Scanner;

public class Zero_One_trianguler {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last row of the triangle");
		int n=sc.nextInt();
		print_Pattern(n);
	}
	public static void print_Pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
		System.out.println("");	
		}
	}
}
