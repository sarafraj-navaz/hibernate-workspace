package array_all_Program;

public class Find_Biggest_And_Second_Biggest_Program16 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,2,4,2,5,4,3,2};
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter the size of the array");
//		int n;
//		int[] a=new int[n=sc.nextInt()];
//		for(int i=0;i<a.length;i++) {
//			System.out.println("enter the element at  position "+(i+1));
//			a[i]=sc.nextInt();
//			
//		}
		getBiggestAndSecondBiggest(a);
	}
	public static void getBiggestAndSecondBiggest(int[] a) {
		int Big=Integer.MIN_VALUE,secondBig=Integer.MIN_VALUE;
		for(int a1:a) {
			if(a1>Big) {
				secondBig=Big;
				Big=a1;
			}
		}
	System.out.println("Maximun 1   :  "+Big);	
	System.out.println("Second Maximum 2:   "+secondBig);
	}
	
}
