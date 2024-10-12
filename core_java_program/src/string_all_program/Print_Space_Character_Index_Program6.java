package string_all_program;

public class Print_Space_Character_Index_Program6 {

	public static void main(String[] args) {

		String s ="Faizan is here ";
        char[] x =s.toCharArray();
        for(int i=0;i<s.length();i++) {
        	if(getSpaceCharacterIndex(x[i])) {
        		System.out.println("index is "+(i+1));
        	}
        }
		
	}
	public static boolean getSpaceCharacterIndex(char s) {
		if(s==' ') {
			return true;
		}
		return false;
	}

}
