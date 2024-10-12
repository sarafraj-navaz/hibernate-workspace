package string_all_program;

public class Count_Vowel_Program4 {

	public static void main(String[] args) {
		String s1 ="Mohan is here but shohan is also hereA";
		System.out.println("total vovel is "+getcountVowel(s1));
	}
	public static int getcountVowel(String s1) {
		int count =0;
		for(int i=0;i<s1.length();i++) {
			char x =s1.charAt(i);
			if(x=='a'|| x=='e'|| x=='i'||x=='o'|| x=='u'|| x=='A'||x=='E'||x=='I'||x=='O'||x=='U') {
				count++;
			}
		}
	return count;	
	}

}
