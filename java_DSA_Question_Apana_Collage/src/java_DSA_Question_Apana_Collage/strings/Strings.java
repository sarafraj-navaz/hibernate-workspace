package java_DSA_Question_Apana_Collage.strings;

public class Strings {

	public static void string1(String name) {
		for(char ch ='a';ch<='z';ch++) {
			 name+=ch; 
			/* System.out.println(name); */
		}
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		String name ="Tony";
		string1(name);

	}

}
