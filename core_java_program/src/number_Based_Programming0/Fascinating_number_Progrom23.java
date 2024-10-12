package number_Based_Programming0;

import java.util.Scanner;

public class Fascinating_number_Progrom23 {
	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        if(getFascinatingNumber(n)) {
        	System.out.println("Fascinating Number "+n);
        }
        else {
        	System.out.println("not fascinating number "+n);
        }
	}
	public static boolean getFascinatingNumber(int n) {
		int n1=n*2;
		int  n2=n*3;
		String s1 =Integer.toString(n),s2 =Integer.toString(n1),s3 =Integer.toString(n2);
//		String s2 =Integer.toString(n1);
//		String s3 =Integer.toString(n2);		
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
