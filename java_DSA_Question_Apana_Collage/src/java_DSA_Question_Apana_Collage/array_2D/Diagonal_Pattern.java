package java_DSA_Question_Apana_Collage.array_2D;

import java.util.Scanner;

public class Diagonal_Pattern {

	public static void diagonalPattern() {
		System.err.println("enter the end ");
		Scanner sc=new Scanner(System.in);
		int end=sc.nextInt();
		System.out.println("end1");
		int end1=sc.nextInt();
		for(int i=0;i<=end;i++) {
			for(int j=0;j<=end1;j++) {
				if(i==j || ((i+j)==3)) {
					System.out.print("*");
				}
				else  {
					System.out.print(" ");
				}
			}
		System.out.println("");	
		}
	}
	public static void main(String[] args) {
		diagonalPattern();
	}

}
