package numbers_All_programs;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the binary number");
		int n=sc.nextInt();
		System.out.println(getDecimal(n));
	}
	public static String getDecimal(int n) {
		int dec=0;
		int comp=0;
		while(n>0) {
			int rem= n%10;
			if(rem==1) {
				dec=dec+rem*comp;
				
			}
			else if(rem>1){
				return "invalid Binary number";
			}
		comp= comp*2;	
		n=n/10;
		}
	return "the decimal values is :"+dec;	
	}

}
