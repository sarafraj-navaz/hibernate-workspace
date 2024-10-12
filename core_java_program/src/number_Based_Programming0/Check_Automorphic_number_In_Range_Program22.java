package number_Based_Programming0;

import java.util.Scanner;

public class Check_Automorphic_number_In_Range_Program22 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the end number as for as you want to take Automorphic number");
		int last=sc.nextInt();
		int totalCount =0;
		for(int i=1;i<last;i++) {
			if(getAutomorphicNumber(i)) {
				totalCount++;
				int squareNumer=(int)(Math.pow(i,2));
				System.out.println(i+" Automorphic number : "+squareNumer);	
			}
		}
		System.out.println("total automorphic number "+totalCount);
	}
	public static boolean getAutomorphicNumber(int n) {
		int countDigit=0,a=n,newNumber=0;
		String s1="";
		while(a>0) {
			countDigit++;
			a=a/10;
		}
		int squareNumber=(int)(Math.pow(n, 2));
		while(countDigit>0) {
			int rem=squareNumber%10;
			s1=rem+s1;
			squareNumber=squareNumber/10;
			countDigit--;
		}
		newNumber=Integer.parseInt(s1);
		if(n!=newNumber) {
			return false;
		}
	return true;	
	}
}
