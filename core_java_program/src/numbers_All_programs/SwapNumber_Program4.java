package numbers_All_programs;

import java.util.Scanner;

public class SwapNumber_Program4 {

	public static void main(String[] args) {
		while(true) {
		System.out.println("1.with third\n 2.without third\n3.new way with third");
		Scanner sc =new Scanner(System.in);
		int key=sc.nextInt();
		switch (key) {
		case 1:{
			
			System.out.println("enter the a");
			int a=sc.nextInt();
			System.out.println("enter the b");
			int b=sc.nextInt();
			withThird(a,b);
		}break;
		case 2:{
			System.out.println("enter the a");
			int a=sc.nextInt();
			System.out.println("enter the b");
			int b=sc.nextInt();
			withoutThirdSwap(a,b);
		}break;
		case 3:{
			System.out.println("enter the a");
			int a=sc.nextInt();
			System.out.println("enter the b");
			int b=sc.nextInt();
			withThirdNewWay(a,b);
		}
		default:
			break;
		}
	}	
}

	public static void withThird(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(" a=="+a);
		System.out.println(" b=="+b);
	}
	public static void withoutThirdSwap(int a,int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a  "+a);
		System.out.println("b==="+b);	
	}
	public static void withThirdNewWay(int a,int b) {
		int c=a+b;
		a=c-a;
		b=c-b;
		System.out.println(" a=="+a);
		System.out.println("b==="+b);
	}
}
