package pattern;
import java.util.Scanner;

public class Number_Triangular {
	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the end row number");
//		int row=sc.nextInt();
//		System.out.println("enter the end column number ");
//		int col=sc.nextInt();
		int row=4;
		int col=7;
	getNumberTriangularPattern(row,col);
	}
	public static void getNumberTriangularPattern(int row,int col) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=(row-i);j++) {
				System.out.print(" ");
			}
			for(int j=(5-i);j<=(col-row)+i;j++) {
				if(((i+j)%2==1)){
					System.out.print(i);
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println(" ");	
		}
	}
}
