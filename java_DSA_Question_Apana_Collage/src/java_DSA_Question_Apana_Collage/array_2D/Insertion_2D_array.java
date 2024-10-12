
package java_DSA_Question_Apana_Collage.array_2D;
import java.util.*;
import java.lang.*;
public class Insertion_2D_array {
	public static void insertion(int numbers[][]) {
		Scanner sc = new Scanner(System.in);
		//for insert only
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				numbers[i][j]=sc.nextInt();
			}
		}
		//print 
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
		System.out.println(" ");	
		}
	}

	public static void main(String[] args) {
		int numbers[][]=new int[3][3];
		insertion(numbers);

	}

}
