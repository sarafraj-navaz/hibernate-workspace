package string_all_program;

public class RemoveAll_doublicate_Character {

	public static void main(String[] args) {
		String s1="abbbbdbdfhf";
		
		 removeDoublicate(s1);
		 
	}
	public static void removeDoublicate(String s) {
		
		char[] x =s.toCharArray();
		int n=x.length;
		System.out.println("length ==="+n);
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(x[i]==x[j]) {
					x[j]=x[n-1];
					n--;
					j--;
				}
			}
		}
		
		//for add char and String
		
		String result="";
		for(int i=0;i<n;i++) {
//			System.out.println(x[i]);
			result =result+x[i];
		}
		
		System.out.println(result);
		System.out.println("-------------------");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	
	}
}
