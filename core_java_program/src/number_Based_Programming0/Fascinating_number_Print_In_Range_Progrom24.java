package number_Based_Programming0;

import java.util.Scanner;

public class Fascinating_number_Print_In_Range_Progrom24 {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the last number as for as you want to take ");
        int last=sc.nextInt();
        int totalCount=0;
        for(int i=1;i<=last;i++) {
            if(getFascinatingNumber(i)) {
            	totalCount++;
            	System.out.println("Fascinating Number "+i);
            }
        }
       System.out.println("total fascinating number "+totalCount); 
	}
	public static boolean getFascinatingNumber(int n) {
		int n1=n*2;
		int  n2=n*3;
		String s1 =Integer.toString(n);
		String s2 =Integer.toString(n1);
		String s3 =Integer.toString(n2);
		String new1=s1+s2+s3;
		char[] ch =new1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					return false;
				}
			}
		}
	return true;	
	}
}
