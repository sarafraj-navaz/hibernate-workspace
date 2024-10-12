package all_Sortting_Program;

import java.util.Scanner;

public class Recursive_Binary_Search_algorithm {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the that number which number you want to search");
		int target =sc.nextInt();
		int min_index=0,max_index=a.length-1;
		int result =search(a,min_index,max_index,target);
		if(result != -1) {
			System.out.println("element is present at index : "+result);
		}
		else {
			System.out.println("element is not present in the array");
		}
	}
	public static int search(int[] a,int min,int max,int t) {
		int min_index=min,max_index=max;
		while(min_index <= max_index) {
			int mid_index =(min_index+max_index)/2;
			if(a[mid_index]==t) {
				return mid_index;
			}
			if(a[mid_index]>=t)
				return search(a,min_index,mid_index-1,t);
			else
				return search(a,mid_index+1,max_index,t);
		}
	return -1;	
	}
}
