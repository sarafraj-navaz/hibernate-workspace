package all_Sortting_Program;

import java.util.Scanner;

public class Itrative_Binary_Search_algorithm {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the target or search element");
		int target =sc.nextInt();
		int result =search(a,target);
		if(result !=-1) {
			System.out.println("element is present at position :"+result);
		}
		else {
			System.out.println("element is not present ");
		}
	}
	public static int search(int[] a,int t) {
		int min_index=0,max_index=a.length-1;
		while(min_index <= max_index) {
	        int mid_index=(min_index+max_index)/2;
	        if(a[mid_index]==t) {
	        	return mid_index;
	        }
	        else if(a[mid_index]>t) {
	        	max_index=mid_index-1;
	        }
	        else {
//	        	mid_index<t
	        	min_index=mid_index+1;
	        }
		}
		return -1; 
	}
}
