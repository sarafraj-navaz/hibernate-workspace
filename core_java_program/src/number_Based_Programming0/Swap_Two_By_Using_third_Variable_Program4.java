package number_Based_Programming0;
import java.util.Scanner;
public class Swap_Two_By_Using_third_Variable_Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		getSwapTwoNumber(a,b);
		System.out.println("user input number "+a+" "+b);
		System.out.println(a+"  "+b);
		
	}
	public static void getSwapTwoNumber(int a,int b) {
		
		int tem=a;
		a=b;
		b=tem;
		System.out.println("After swap :"+a+" "+b);
	}

}
