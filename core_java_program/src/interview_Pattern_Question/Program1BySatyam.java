package interview_Pattern_Question;

import java.util.Scanner;

public class Program1BySatyam {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the nummber");
		int n=sc.nextInt();
		printPattern(n);
	}
	
	public static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int c=1;c<=(2*i)-1;c++) {
				System.out.print("*");
			}
		System.out.println(" ");	
		}
	System.out.println("");	
	}

}
