package java_DSA_Question_Apana_Collage.array_2D;

public class Spiral_Matrix {

	public static void printSpiral(int matrix[][]) {
		/*
		 * this is code for even matrix 
		 */
		
		int startRow=0,endRow=matrix.length-1,startCol=0,endCol=matrix.length-1;
		while(startRow <= endRow && startCol <= endCol) {
			//top column
			for(int j=startCol;j<=endCol;j++) {
				System.out.print(matrix[startRow][j]+" ");
			}
			//right row
			for(int i=startRow+1;i<=endRow;i++) {
				System.out.print(matrix[i][endCol]+" ");
			}
			//bottom column
			for(int j=endCol-1;j>=startCol;j--) {
				System.out.print(matrix[endRow][j]+" ");
			}
			//left row
			for(int i=endRow-1;i>startRow;i--) {
				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		printSpiral(matrix);

	}
	public static void printSpiralOdd_matrix(int matrix[][]) {
		/*
		 * 
		 * this is code for the odd as well as even matrix 4*4 even 5*5 odd
		 */
		
		int startRow=0,endRow=matrix.length-1,startCol=0,endCol=matrix.length-1;
		while(startRow <= endRow && startCol <= endCol) {
			//top column
			for(int j=startCol;j<=endCol;j++) {
				System.out.print(matrix[startRow][j]+" ");
			}
			//right row
			for(int i=startRow+1;i<=endRow;i++) {
				System.out.print(matrix[i][endCol]+" ");
			}
			//bottom column
			for(int j=endCol-1;j>=startCol;j--) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(matrix[endRow][j]+" ");
			}
			//left row
			for(int i=endRow-1;i>startRow;i--) {
				if(startCol == endCol) {
					break;
				}
				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
	}

}
