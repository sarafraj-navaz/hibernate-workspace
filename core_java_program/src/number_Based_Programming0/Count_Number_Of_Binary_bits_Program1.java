package number_Based_Programming0;

import java.util.Scanner;

public class Count_Number_Of_Binary_bits_Program1 {

	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
		 n=countNumberBit(n);
		 System.out.println("count is "+n);
	}
	public static int countNumberBit(int n) {
		int count=0;
	    while(n>0) {
	    	count++;
	    	
	    	n=n/2;
	    }
	return count;	
	}

}
