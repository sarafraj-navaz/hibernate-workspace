package java_DSA_Question_Apana_Collage.array;

import java.util.Scanner;

public class BinarySearch {

	public static int search(int number[],int key) {
		int start =0,end =number.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(number[mid]==key) {
				return mid;
			}
			if(number[mid]>key) {
				end =mid-1;
			}
			else {
				start =mid+1;
			}
		}
	return -1;	
	}
	public static void main(String[] args) {
		int number[] = { 2, 4, 6, 8, 10, 12, 14 }/* ,key=10 */;
	    Scanner sc =new Scanner(System.in);
	    System.out.println("enter the key which key do you wantin an array");
	    int key =sc.nextInt();
		int index =search(number,key);
		
		if(index ==-1) {
			System.out.println("key is not present in an arrary"+index);
		}
		else {
			System.out.println("key is present at the index positon   "+index);
		}

	}

}
