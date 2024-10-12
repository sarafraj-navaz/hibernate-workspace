package file_handling;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("enter  the a");
		int a=sc.nextInt();
		System.out.println("enter the number b");
		int b=sc.nextInt();
		System.out.println(a+"+"+b+"= "+(a+b));
		try {
			System.out.println(a+"/"+b+"= "+(a/b));
		}
		catch (Exception e) {
			System.out.println("infinity exception");
		}
		System.out.println(a+"*"+b+" ="+(a*b));
	}

}
