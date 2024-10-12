package string_all_program;

import java.util.Scanner;

public class Remove_All_Doublicate_Character_And_StoreAnotherString_Program12 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String ");
		String s1 =sc.next();
		s1=removeDoublicateString(s1);
		System.out.println("Without Doublicate String  :  "+s1);
		
	}
	public static String removeDoublicateString(String s1) {
		int n=s1.length();
		char[] x =s1.toCharArray();		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(x[i]==x[j]) {
					x[j]=x[n-1];
					j--;
					n--;
				}
			}
		}
		String result="";
		
		for(int i=0;i<n;i++) {
			result =result+x[i];
		}
	return result;	
	}

}
