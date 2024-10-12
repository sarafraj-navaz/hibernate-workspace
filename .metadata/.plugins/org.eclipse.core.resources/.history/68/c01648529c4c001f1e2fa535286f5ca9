package number_Based_Programming0;

public class Decimal_to_Binary_otherWay {
	public static void main(String[] args) {
		int n=345;
		while(n>0) {
			int rem=n%10;
			binaryNumber(rem);
			n=n/10;
		}
	}
	public static void binaryNumber(int rem) {
		int count=getCount(rem),bNumber=0,n2=rem,i=0;
	System.out.println("count of bits "+count);
		while(i<count) {
			int rem1=rem%2;
			bNumber=((int)Math.pow(10,i))*rem1+bNumber;
			i++;
			rem=rem/2;
		}
		
		System.out.println("Binary Number of "+n2+"===="+bNumber);
	}
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/2;
		}
		return count;
	}

}
