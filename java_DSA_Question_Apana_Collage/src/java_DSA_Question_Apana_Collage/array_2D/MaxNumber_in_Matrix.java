package java_DSA_Question_Apana_Collage.array_2D;

import java.util.Scanner;

public class MaxNumber_in_Matrix {

	public static void searchMax(int matrix[][]) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("enter the element of the matrix");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				/*
				 * if(max < matrix[i][j]) { max = matrix[i][j]; }
				 */
				max=Math.max(max, matrix[i][j]);
				min=Math.min(min, matrix[i][j]);
			}
		}
	System.out.println("maximum number of the matrix is "+max);	
	System.out.println("minimum number of the matrix is "+min);	
	}
	public static void main(String[] args) {
		System.out.println("enter the size of the row");
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("enter the size of the column");
		int col=sc.nextInt();
		int matrix[][] =new int[row][col];
		searchMax(matrix);

	}

}
