package array_all_Program;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class Find_Smallest_And_Second_Smallest_Program17 {
	
	public static void main(String[] args) {
//		int[] a = { 1, 2, 3, 4, 2, 4, 2, 5, 4, 3, 2 };
		int[] a= {1};

//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter the element at  position "+(i+1));
//			a[i]=sc.nextInt();
//			
//		}
		getSmallestAndSecondSmallest(a);
	}
	public static void getSmallestAndSecondSmallest(int[] a) {
		if(a.length<2) {
			System.out.println("you have to enter alteast two in the array");
		}
	 
			int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;
			for(int num:a) {
				if(num<smallest) {
					secondSmallest=smallest;
					smallest=num;
				}
				else if(num<secondSmallest && num >smallest) {
					secondSmallest=num;
				}
			}
		if(secondSmallest==Integer.MAX_VALUE) {
			System.out.println("there is no second Smallest number");
		}
		else {
			System.out.println("Smallest number  "+smallest);
			System.out.println("Second Smallest Number "+secondSmallest);
		}
	}
}
