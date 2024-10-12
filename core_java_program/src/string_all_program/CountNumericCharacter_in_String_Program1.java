package string_all_program;

public class CountNumericCharacter_in_String_Program1 {

	public static void main(String[] args) {
	
		String s1 ="mo45h7an";
	    	int a =countNumericCharacter(s1);
	    	System.out.println(a);
		
	}
	public static int countNumericCharacter(String s) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				char p =s.charAt(i);
				if(p>=48 && p<=57) {
					count++;
				}
					
			}	
	return count;	
	}

}
