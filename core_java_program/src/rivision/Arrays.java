package rivision;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int[] a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			if(i%2 !=0) {
				System.out.println(i+"element of the odd index "+a[i]);
			}
			if(a[i]%2==0) {
				System.out.println("even element "+a[i]);
			}
		}
	}
}
