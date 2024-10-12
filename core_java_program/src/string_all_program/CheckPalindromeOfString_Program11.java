package string_all_program;

import java.util.Scanner;

public class CheckPalindromeOfString_Program11 {

	public static void main(String[] args) {
//		  String s1 ="madam";//it is check palidrome number
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the String ");
		String s1 =sc.next();

		if(checkPalidrome(s1)) {
			System.out.println("String is Palidrome");
		}
		else {
			System.out.println("String is not Palidrome");
		}
		
	}
	public static boolean checkPalidrome(String s1) {
		
		int n=s1.length();
		for(int i=0;i<n;i++) {
			if(s1.charAt(i)!=s1.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}

}
