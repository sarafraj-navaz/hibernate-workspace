package java_DSA_Question_Apana_Collage.array_2D;

import java.util.Scanner;

public class Search1 {

	public static boolean search(int matrix[][],int key) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 2*2 matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println("m==  "+matrix[0].length);
				if(matrix[i][j]==key) {
					 System.out.println("key is present at index "+"("+i +","+j+")"); 
					
					return true;
				}
			}
		}
		return false;
	}

	public static boolean search1(int matrix[][],int key) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.println("m==  "+matrix[0].length);
				if(matrix[i][j]==key) {
					 System.out.println("key is present at index "+"("+i +","+j+")"); 
					
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		/* int matrix[][] = new int[2][2]; */
		int matrix[][] = {{1,2},{3,4}};
		System.out.println("enter the Search key");
		int key=new Scanner(System.in).nextInt();
		search1(matrix,key);

	}

}
