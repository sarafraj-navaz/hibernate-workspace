package array_all_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Check_Frequency_Using_Collections_Program11 {
	public static void main(String[] args) {
		Integer[] a= {1,2,3,4,2,4,2,5,4,3,2};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the element which element do you want to take frequency");
		int n=sc.nextInt();
		int n1=Collections.frequency(Arrays.asList(a), n);
		System.out.println(n+"frequency "+n1);
	}
	
}
