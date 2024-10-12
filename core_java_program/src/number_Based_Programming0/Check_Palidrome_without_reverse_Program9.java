package number_Based_Programming0;

import java.util.Scanner;

public class Check_Palidrome_without_reverse_Program9 {

	public static void main(String[] args) {
//		int n=123;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the number");
		int n=sc.nextInt();
		if(checkPalidrome(n)) {
			System.out.println("palidrome number");
		}
		else {
			System.out.println("not palidrome number");
		}
	}
	
	public static boolean checkPalidrome(int n) {
		int a=n;
		int a1=n;
		int digitcount=0;
		
		while(n>0) {
			digitcount++;
			n=n/10;
		}
		int x=digitcount-1;
		int i=1;
		while(i<=digitcount/2) {
				int rem=a%10;
				int digit =(int)(a1/Math.pow(10,x));
				int rem1=digit%10;
				System.out.println(rem1+"  "+rem);
				if(rem !=rem1) {
					return false;
				}
				a=a/10;
		x--;
		i++;
		}
		return true;	
	}
}
