package java_DSA_Question_Apana_Collage.array_2D;

public class Diagonal_Sum {

	public static void diagonalSum(int matrix[][]) {
		/*
		 * time complixity of the O(n)
		 */
		int PrimarySum = 0, SecondarySum = 0;
		for (int i = 0; i < matrix.length; i++) {
			PrimarySum+=matrix[i][i];
			if(i != matrix.length-i-1) {
				SecondarySum+=matrix[i][matrix.length-i-1];
			}
		}
		System.out.println("primary Sum Disgonal  "+PrimarySum);
		System.out.println("secondary Sum Diagonal Sum  "+SecondarySum);
	}

	public static void main(String[] args) {
		int matrix[][] = { { 2, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		diagonalSum(matrix);
		System.err.println("Time complixity is difference");
		diagonalSum1(matrix);
	}
	
    public static void diagonalSum1(int matrix[][]){
    	/*
    	 * time complixity of the code is O(n^2)
    	 */
    	int sum=0,sum1=0;
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix.length;j++) {
    			if(i==j) {
    				sum+=matrix[i][j];
    			}
    			else if(i+j==matrix.length-1){
    				sum1+=matrix[i][j];
    			}
    		}
    	}
    System.out.println("primary sum    "+sum);
    System.out.println("Secondary sum    "+sum1);
    }
}
