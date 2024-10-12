package java_DSA_Question_Apana_Collage.array;

public class ArrayPairSimple {

	public static void pair(int number[]) {
		int start=0;
		while(start !=number.length-1) {
			for(int i=(start+1);i<number.length;i++) {
				System.out.print("("+number[start]+","+number[i]+") ");
				
			}
			System.out.println(" ");
			start++;
		}
		
	}
	public static void main(String[] args) {
		int number[]= {2,4,6,8,10};
		pair(number);

	}

}
