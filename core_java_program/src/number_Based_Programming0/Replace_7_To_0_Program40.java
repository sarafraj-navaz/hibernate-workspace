package number_Based_Programming0;

import java.util.Scanner;

public class Replace_7_To_0_Program40 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the digite of the number ");
		int n=sc.nextInt();
		System.out.println("Original number  "+n);
		System.out.println("after replace "+getReplace(n));
	}
	public static int getReplace(int n) {
		String sum="";
		while(n>0) {
			int rem=n%10;
			if(rem==7) {
				rem=0;
			}
			sum=rem+sum;
			n=n/10;
		} 
	 int result=Integer.parseInt(sum);
	 return result;
	}
}
