package number_Based_Programming0;

import java.util.Scanner;

public class CheckPalidrome_Program8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(checkPalidrome(n)) {
			System.out.println("Palidrome "+n);
		}
		else {
			System.out.println("not Palidrome "+n);
		}
	}
	public static boolean checkPalidrome(int n) {
		int a=n;
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev =rev*10+rem;
			
			n=n/10;
		}
		System.out.println("Reverse number is"+rev);
		if(a!=rev) {
			return false;
		}
	return true;	
	}
}
