package number_Based_Programming0;

import java.util.Scanner;

public class Shift_Zero_Left_Side_And_One_Right_Side_Program10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("enter the number in the form Of 0 and 1");
        int n=sc.nextInt();
        String s1=shift0And1(n);
        System.out.println("After shifting "+s1);
	}
	public static String shift0And1(int n) {
		String s1="";
		while(n>0) {
			int rem=n%10;
			if(rem==0) {
				s1=rem+s1;
			}
			else if(rem==1) {
				s1 =s1+rem;
			}
		n=n/10;	
		}
	return s1;	
	}
}
