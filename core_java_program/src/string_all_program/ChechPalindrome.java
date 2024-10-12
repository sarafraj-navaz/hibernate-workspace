package string_all_program;

public class ChechPalindrome {

	public static void main(String[] args) {
	   int n=5885;
	   String s =String.valueOf(n);// now it will represent String
	   if(checkPalindrom(s)) {
		   System.out.println("Palidrome");
	   }
	   else {
		   System.out.println("not palidrome");
	   }
	   
	   
	}
	public static boolean checkPalindrom(String s) {
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			if((s.charAt(i)) != (s.charAt(n-1-i))) {
				return false;
			}
		}
		return true;
	}

}
