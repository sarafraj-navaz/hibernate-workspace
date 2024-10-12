package collection_Program;

import java.util.*;

public class Program43 {
	public static void main(String[] args) {
		int[] a= {12, 34, 45, 12, 34, 45, 67, 34};
		System.out.print("With Duplicates: ");
		for(int x: a)
		{
			System.out.print(x+"  ");
		}
		System.out.println();
		removeDuplicates(a);
	}
	public static void removeDuplicates(int[] a)
	{
		Set<Integer> s1=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			s1.add(a[i]);
		}
		System.out.println("Without Duplicates: "+s1);
	}
}
