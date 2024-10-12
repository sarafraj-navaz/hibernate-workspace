package string_all_program;

public class GetCountWithoutSpace_character_Program2 {

	public static void main(String[] args) {
		String s1 ="Faizan and Satyam is here";
		int count= getCountCharacterWithoutSpace(s1);
		System.out.println("with space total character is "+s1.length());
		System.out.println(count);
		

	}
	public static int getCountCharacterWithoutSpace(String s) {
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
		}
	return count;	
	}

}
