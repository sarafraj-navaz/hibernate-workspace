package number_Based_Programming0;

import java.util.Scanner;

public class Check_Automorphic_number_Program21 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if(getAutomorphicNumber(n)) {
			System.out.println("Automorphic number  "+n);
		}
		else {
			System.out.println("not Automorphic number "+n);
		}
	}
	public static boolean getAutomorphicNumber(int n) {
		int a1=n,squareNumber=0,totalDigit=0;
		while(a1>0) {
			totalDigit++;
			a1=a1/10;
		}
		squareNumber=(int)(Math.pow(n,2));
		int newNumber=0;
		String s1="";
		while(totalDigit>0) {
			int rem=squareNumber%10;
			s1=rem+s1;
			squareNumber=squareNumber/10;
			totalDigit--;
		}
		newNumber=Integer.parseInt(s1);
		if(n!=newNumber) {
			return false;
		}
	return true;	
	}
}
