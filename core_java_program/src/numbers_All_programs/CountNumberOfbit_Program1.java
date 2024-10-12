package numbers_All_programs;

public class CountNumberOfbit_Program1 {

	/*
	 * WAJP TO TAKE USER INPUT COUNT NUMBER OF BITIN THAT NUMBER
	 */
	public static void main(String[] args) {
		countNumberOfBit(58);
	}

	public static void countNumberOfBit(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/2;
			System.out.println(n);
		}
		System.out.println(count);
	}
}
