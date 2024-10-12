package array_all_Program;

import java.util.Scanner;

public class Pascal_Triangle_Program32 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the row number by the Which Row you want print");
		int n=sc.nextInt();
		printPascal(n);
	}
	public static void printPascal(int n) {
		for(int i=1;i<=n;i++) {
			int ans=1;
			System.out.print(ans);
			for(int j=1;j<i;j++) {
				ans=ans*(i-j);
				ans=ans/j;
				System.out.print(ans);
			}
		System.out.println("");	
		}
	}
}
