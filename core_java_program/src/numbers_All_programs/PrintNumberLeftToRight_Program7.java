package numbers_All_programs;

import java.util.Scanner;

public class PrintNumberLeftToRight_Program7 {

	public static void main(String[] args) {
	
		Scanner  sc =new Scanner(System.in);
		int n=sc.nextInt();
		printLeftToRight(n);
	}
	public static void printLeftToRight(int  n) {
	
		int count =0;
		int a=n;
		int  p=n;
	
		while(n>0) {
			count++;
			n=n/10;
		}
		int x=count-1;
		int i=1;
		while(i<=count) {
			int left=((int)(p/Math.pow(10, x)))%10;
			System.out.println("left"+left);
			a=a/10;
			x--;
			i++;
		}
		
	}

}
