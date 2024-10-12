package numbers_All_programs;

import java.util.Scanner;

public class CheckPalindromeBY_Reversing_or_Comparing_Program8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if(checkPalindrome(n))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}
	public static boolean checkPalindrome(int n) {
		int count=0;
		int a=n;int p=n;
		while(n>0) {
			count++;
			n=n/10;
		}
		int i=1;int x=count-1;
		while(i<=(count/2)) {
			int right=a%10;
			System.out.println("right "+right);
			int left =(int)(p/Math.pow(10, x))%10;
			System.out.println("left is "+left);
			if(right != left)
				return false;
			a=a/10;
          i++;			
		}
		return true;
	}

}
