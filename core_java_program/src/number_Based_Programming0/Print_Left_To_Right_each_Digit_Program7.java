package number_Based_Programming0;

public class Print_Left_To_Right_each_Digit_Program7 {

	public static void main(String[] args) {
		int n=123;
		printRightToLeft(n);
		
	}
	public static void printRightToLeft(int n) {
		int a=n;
		int count=0;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println("count is "+count);
		int x=count-1;
		while(x>=0) {
			int digit =(int)(a/Math.pow(10,x));
			System.out.println(digit);
			int rem=digit%10;
			System.out.println("rem  :"+rem);
			x--;
		}
	}
    
}
