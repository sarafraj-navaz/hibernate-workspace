package array_all_Program;

import java.util.Scanner;

public class Shift_0_left_And_1_Right_Program18 {
	public static void main(String[] args) {
//		int[] a = {0,1,1,0,0,1,0,0};
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int n;
		int[] a=new int[n=sc.nextInt()];
		for(int i=0;i<n;i++) {
			System.out.println("enter the element at  position "+(i+1));
			a[i]=sc.nextInt();
		}
		
		
		a=shift_0_And_1_left_And_Right(a);
		for(int a1:a) {
			System.out.print(a1+" ");
		}
	}
	public static int[]  shift_0_And_1_left_And_Right(int[]  a) {
		String s1="";
	    for(int a1:a) {
	      if(a1==1 || a1==0) {
	    	  if(a1==1)
	    		  s1=s1+a1;
	    	  else
	    		  s1=a1+s1;
	      }
	      else {
	    	  System.out.println("you have entered wrong input");
	      }
	    }
	    int[] b=new  int[a.length];
	    char[] c1=s1.toCharArray();
	    
	    for(int i=0;i<a.length;i++) {
	    	b[i]=c1[i]-48;
	    }
	 return b;   
	}
}
