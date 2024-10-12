package number_Based_Programming0;

public class CountNumberOf_0_And_1_bits_Program2 {

	public static void main(String[] args) {
		int n=58;
		n= count0_bits_1_bits_Number(n);
		System.out.println("total bits is :"+n);
		
		

	}
	public static int count0_bits_1_bits_Number(int n) {
		int count=0;
		int count0=0;
		int countOne=0;
		while(n>0) {
			int rem=n%2;
			count++;
			System.out.println("bit is "+rem);
			if(rem==0) {
				count0++;
			}
			else {
				countOne++;
			}
		n=n/2;	
		}
		System.out.println("total O bits are  : "+count0);
		System.out.println("total One bits are :"+countOne);
		
	return count;	
	}

}
