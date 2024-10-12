package string_all_program;

public class Find_Numeric_Character_Index_Program5 {

	public static void main(String[] args) {
		String s ="kjsah2367s1";
	    
		getNumericCharacter(s);
		

	}
	public static void getNumericCharacter(String s) {
		char[] s1= s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=48 && s.charAt(i)<=57)) {
				System.out.println("index value of the numeric Chracter "+i+" "+s1[i]);
			}
			
		}
	}

}
