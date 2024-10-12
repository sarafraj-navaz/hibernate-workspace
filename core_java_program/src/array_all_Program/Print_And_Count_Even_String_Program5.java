package array_all_Program;

import java.util.Scanner;

public class Print_And_Count_Even_String_Program5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n;
		String[] a=new String[n=sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the String at position "+(i+1));
			a[i]=sc.next();
		}
		getEvenString(a);

	}
	public static void getEvenString(String[] a) {
		int totalCount=0;
		for(int i=0;i<a.length;i++) {
			int l=a[i].length();
//			System.out.println("length "+l);
			if(l%2==0){
				totalCount++;
				System.out.println(a[i]+" ");
			}
		}
	System.out.println("total Even String : "+totalCount);	
	}
}
